
package com.infy.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAllResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAllResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allItems" type="{http://service/}itemList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllResponse", propOrder = {
    "allItems"
})
public class GetAllResponse {

    protected ItemList allItems;

    /**
     * Gets the value of the allItems property.
     * 
     * @return
     *     possible object is
     *     {@link ItemList }
     *     
     */
    public ItemList getAllItems() {
        return allItems;
    }

    /**
     * Sets the value of the allItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemList }
     *     
     */
    public void setAllItems(ItemList value) {
        this.allItems = value;
    }

}
