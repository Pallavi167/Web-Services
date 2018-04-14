
package com.infogain.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.infogain.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PayAmtResponse_QNAME = new QName("http://infogain.com/", "payAmtResponse");
    private final static QName _PayAmt_QNAME = new QName("http://infogain.com/", "payAmt");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.infogain.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PayAmt }
     * 
     */
    public PayAmt createPayAmt() {
        return new PayAmt();
    }

    /**
     * Create an instance of {@link PayAmtResponse }
     * 
     */
    public PayAmtResponse createPayAmtResponse() {
        return new PayAmtResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayAmtResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://infogain.com/", name = "payAmtResponse")
    public JAXBElement<PayAmtResponse> createPayAmtResponse(PayAmtResponse value) {
        return new JAXBElement<PayAmtResponse>(_PayAmtResponse_QNAME, PayAmtResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayAmt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://infogain.com/", name = "payAmt")
    public JAXBElement<PayAmt> createPayAmt(PayAmt value) {
        return new JAXBElement<PayAmt>(_PayAmt_QNAME, PayAmt.class, null, value);
    }

}
