package com.infogain.enterprise;

import java.awt.Image;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.soap.MTOM;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
@MTOM
public interface FlickerService {

	
	@WebMethod
	Image downloadImage(String imageName);

	
	
}