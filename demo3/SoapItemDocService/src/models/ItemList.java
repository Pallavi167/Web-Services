package models;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;


//@XmlSeeAlso Instructs JAXB to also bind other classes when binding this class(ItemList)

@XmlRootElement(name="itemsList")
@XmlSeeAlso(value={Item.class})
public class ItemList {

	List<Item> itemList;

	
	@XmlElement(name="items")
	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
	
	
}
