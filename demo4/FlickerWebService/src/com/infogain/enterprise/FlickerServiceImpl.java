package com.infogain.enterprise;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.jws.WebService;
import javax.xml.ws.soap.MTOM;

@WebService(endpointInterface = "com.infogain.enterprise.FlickerService")
public class FlickerServiceImpl implements FlickerService {

	@Override
	public Image downloadImage(String imageName) {
 
		try {
			//System.out.println("img name: "+imageName); 
		
			File imageFile = new File("./ServerBox/"+imageName);
			Image im = ImageIO.read(imageFile);
			return im;
 
		} catch (IOException e) {
 
			e.printStackTrace();
			return null; 
 
		}
	}
 
	
	
	
}