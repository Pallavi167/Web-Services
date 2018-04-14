package com.infy.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;


public class ProxylessClient {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://localhost:9090/SoapItemDocService?wsdl");			
			QName qname = new QName("http://infy/services", "ItemFinderServiceService"); 
			Service service = Service.create(url, qname); 
			ItemFinder itemFinderPort=service.getPort(ItemFinder.class);
			Item i=itemFinderPort.getById(104);
			System.out.println("item details are:");
			System.out.println(i.getName()+"\t"+i.getBrand()+"\t"+i.getPrice());
				
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
