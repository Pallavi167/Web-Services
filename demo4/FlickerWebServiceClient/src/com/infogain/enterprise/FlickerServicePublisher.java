package com.infogain.enterprise;
import javax.xml.ws.Endpoint;

import com.infogain.enterprise.FlickerServiceImpl;

public class FlickerServicePublisher {
 
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:5004/webservice/imageService", new FlickerServiceImpl());
	   System.out.println("web service to  download images  is deployed successfully");
	   
	   
    }
 
}