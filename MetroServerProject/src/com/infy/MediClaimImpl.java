package com.infy;

import java.util.HashMap;
import java.util.Map;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;



@WebService(endpointInterface="com.infy.MediClaim",serviceName="Fortis")
@SOAPBinding(style=Style.DOCUMENT)
public class MediClaimImpl implements MediClaim {

	static Map<Integer,String>records=new HashMap<Integer,String>();
	static{
		records.put(101,"Vinod ,reimbursementamt: 50000,date:12/09/2014 ");
		records.put(102,"Ryan ,reimbursementamt: 55000,date:13/09/2014 ");
	}	
	
	
	public Information getClaim(int claimId) {
		Information  info=new Information();
		info.setDetail("reimbursementamt: 55000,date:13/09/2014 ");
		info.setInfoId(101);
		//String claimDetails=records.get(claimId);		
		return info;
	}

}








