
package clientpack;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the clientpack package. 
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

    private final static QName _GetClaim_QNAME = new QName("http://infy.com/", "getClaim");
    private final static QName _Information_QNAME = new QName("http://infy.com/", "information");
    private final static QName _GetClaimResponse_QNAME = new QName("http://infy.com/", "getClaimResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clientpack
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Information }
     * 
     */
    public Information createInformation() {
        return new Information();
    }

    /**
     * Create an instance of {@link GetClaimResponse }
     * 
     */
    public GetClaimResponse createGetClaimResponse() {
        return new GetClaimResponse();
    }

    /**
     * Create an instance of {@link GetClaim }
     * 
     */
    public GetClaim createGetClaim() {
        return new GetClaim();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClaim }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://infy.com/", name = "getClaim")
    public JAXBElement<GetClaim> createGetClaim(GetClaim value) {
        return new JAXBElement<GetClaim>(_GetClaim_QNAME, GetClaim.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Information }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://infy.com/", name = "information")
    public JAXBElement<Information> createInformation(Information value) {
        return new JAXBElement<Information>(_Information_QNAME, Information.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClaimResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://infy.com/", name = "getClaimResponse")
    public JAXBElement<GetClaimResponse> createGetClaimResponse(GetClaimResponse value) {
        return new JAXBElement<GetClaimResponse>(_GetClaimResponse_QNAME, GetClaimResponse.class, null, value);
    }

}
