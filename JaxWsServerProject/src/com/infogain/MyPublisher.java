package com.infogain;

import javax.xml.ws.Endpoint;

public class MyPublisher {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsuranceService service = new InsuranceService();
Endpoint.publish("http://localhost:2222/icicilombard",service);
System.out.println("jaxws web service deployed successfully");
	}

}
