
package clientpack;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for information complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="information">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mediinfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="infoId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "information", propOrder = {
    "mediinfo",
    "infoId"
})
public class Information {

    protected String mediinfo;
    protected int infoId;

    /**
     * Gets the value of the mediinfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediinfo() {
        return mediinfo;
    }

    /**
     * Sets the value of the mediinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediinfo(String value) {
        this.mediinfo = value;
    }

    /**
     * Gets the value of the infoId property.
     * 
     */
    public int getInfoId() {
        return infoId;
    }

    /**
     * Sets the value of the infoId property.
     * 
     */
    public void setInfoId(int value) {
        this.infoId = value;
    }

}
