package com.infogain;

import java.util.HashMap;
import java.util.Map;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
@WebService
 public class InsuranceService {

	static Map<Integer, Integer> custList = new HashMap<Integer, Integer>();
	static {
		custList.put(101, 10000);
		custList.put(102, 20000);
		custList.put(103, 30000);
	}

	public int payAmt(int policyNo, int paidAmt) {
		int totalAmt = custList.get(policyNo);
		int bal = totalAmt - paidAmt;
		return bal;

	}
}
