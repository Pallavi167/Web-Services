package com.infogain.enterprise.client;

import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.infogain.enterprise.FlickerService;
import javax.xml.ws.soap.MTOMFeature;
public class FlickerClient {

	public static void main(String[] args) throws Exception {
		//  local monitoring port is 1111,so request will hit it means debug server
	//	URL url = new URL("http://localhost:1111/webservice/imageService?wsdl");
		URL url = new URL("http://localhost:5004/webservice/imageService?wsdl");
		
        QName qname = new QName("http://enterprise.infogain.com/", "FlickerServiceImplService");
        
        
    
        Service service = Service.create(url, qname);
        FlickerService flickerService = service.getPort(FlickerService.class);
        		
 
       
        /********* Download ***********/
    
        //display the received image in a frame       
        String imgName=JOptionPane.showInputDialog(null,"enter image name to download like Tulips.jpg");        
        Image image = flickerService.downloadImage(imgName);
        JFrame frame = new JFrame();
        frame.setSize(800, 800);
        JLabel label = new JLabel(new ImageIcon(image));
        frame.add(label);
        frame.setVisible(true);
       
        
        
       
    }
 
}