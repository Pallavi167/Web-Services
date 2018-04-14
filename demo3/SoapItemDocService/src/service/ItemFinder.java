package service;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.bind.annotation.XmlSeeAlso;

import models.Item;
import models.ItemList;

@WebService
@SOAPBinding(style=Style.DOCUMENT)

@XmlSeeAlso(value={models.Item.class})
public interface ItemFinder {

	
	
	@WebResult(name="selectedItem")
	public Item getById(@WebParam(name="id") int id);
	
	@WebMethod
	@WebResult(name="selectedItem")
	public Item getByItemId(@WebParam(name="iid") int id);
	
	@WebMethod(operationName="")
	@WebResult(name="itemsOfTheBrand")
	public ItemList getByBrand(@WebParam(name="brand")String brand);
	
	@WebMethod
	@WebResult(name="allItems")
	public ItemList getAll();
}







