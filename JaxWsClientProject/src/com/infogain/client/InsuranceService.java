
package com.infogain.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "InsuranceService", targetNamespace = "http://infogain.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface InsuranceService {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "payAmt", targetNamespace = "http://infogain.com/", className = "com.infogain.client.PayAmt")
    @ResponseWrapper(localName = "payAmtResponse", targetNamespace = "http://infogain.com/", className = "com.infogain.client.PayAmtResponse")
    @Action(input = "http://infogain.com/InsuranceService/payAmtRequest", output = "http://infogain.com/InsuranceService/payAmtResponse")
    public int payAmt(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

}
