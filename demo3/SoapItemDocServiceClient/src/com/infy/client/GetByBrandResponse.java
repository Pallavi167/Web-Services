
package com.infy.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getByBrandResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getByBrandResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemsOfTheBrand" type="{http://service/}itemList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getByBrandResponse", propOrder = {
    "itemsOfTheBrand"
})
public class GetByBrandResponse {

    protected ItemList itemsOfTheBrand;

    /**
     * Gets the value of the itemsOfTheBrand property.
     * 
     * @return
     *     possible object is
     *     {@link ItemList }
     *     
     */
    public ItemList getItemsOfTheBrand() {
        return itemsOfTheBrand;
    }

    /**
     * Sets the value of the itemsOfTheBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemList }
     *     
     */
    public void setItemsOfTheBrand(ItemList value) {
        this.itemsOfTheBrand = value;
    }

}
