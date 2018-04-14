
package com.infy.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getByIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getByIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="selectedItem" type="{http://service/}item" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getByIdResponse", propOrder = {
    "selectedItem"
})
public class GetByIdResponse {

    protected Item selectedItem;

    /**
     * Gets the value of the selectedItem property.
     * 
     * @return
     *     possible object is
     *     {@link Item }
     *     
     */
    public Item getSelectedItem() {
        return selectedItem;
    }

    /**
     * Sets the value of the selectedItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Item }
     *     
     */
    public void setSelectedItem(Item value) {
        this.selectedItem = value;
    }

}
