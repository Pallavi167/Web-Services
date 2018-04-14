
package com.infy.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.infy.client package. 
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

    private final static QName _GetByBrandResponse_QNAME = new QName("http://service/", "getByBrandResponse");
    private final static QName _GetByIdResponse_QNAME = new QName("http://service/", "getByIdResponse");
    private final static QName _GetAll_QNAME = new QName("http://service/", "getAll");
    private final static QName _GetById_QNAME = new QName("http://service/", "getById");
    private final static QName _GetByItemId_QNAME = new QName("http://service/", "getByItemId");
    private final static QName _Item_QNAME = new QName("http://service/", "item");
    private final static QName _GetByBrand_QNAME = new QName("http://service/", "getByBrand");
    private final static QName _GetByItemIdResponse_QNAME = new QName("http://service/", "getByItemIdResponse");
    private final static QName _ItemsList_QNAME = new QName("http://service/", "itemsList");
    private final static QName _GetAllResponse_QNAME = new QName("http://service/", "getAllResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.infy.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetByIdResponse }
     * 
     */
    public GetByIdResponse createGetByIdResponse() {
        return new GetByIdResponse();
    }

    /**
     * Create an instance of {@link GetAll }
     * 
     */
    public GetAll createGetAll() {
        return new GetAll();
    }

    /**
     * Create an instance of {@link ItemList }
     * 
     */
    public ItemList createItemList() {
        return new ItemList();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link GetByBrandResponse }
     * 
     */
    public GetByBrandResponse createGetByBrandResponse() {
        return new GetByBrandResponse();
    }

    /**
     * Create an instance of {@link GetAllResponse }
     * 
     */
    public GetAllResponse createGetAllResponse() {
        return new GetAllResponse();
    }

    /**
     * Create an instance of {@link GetById }
     * 
     */
    public GetById createGetById() {
        return new GetById();
    }

    /**
     * Create an instance of {@link GetByBrand }
     * 
     */
    public GetByBrand createGetByBrand() {
        return new GetByBrand();
    }

    /**
     * Create an instance of {@link GetByItemIdResponse }
     * 
     */
    public GetByItemIdResponse createGetByItemIdResponse() {
        return new GetByItemIdResponse();
    }

    /**
     * Create an instance of {@link GetByItemId }
     * 
     */
    public GetByItemId createGetByItemId() {
        return new GetByItemId();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByBrandResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getByBrandResponse")
    public JAXBElement<GetByBrandResponse> createGetByBrandResponse(GetByBrandResponse value) {
        return new JAXBElement<GetByBrandResponse>(_GetByBrandResponse_QNAME, GetByBrandResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getByIdResponse")
    public JAXBElement<GetByIdResponse> createGetByIdResponse(GetByIdResponse value) {
        return new JAXBElement<GetByIdResponse>(_GetByIdResponse_QNAME, GetByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getAll")
    public JAXBElement<GetAll> createGetAll(GetAll value) {
        return new JAXBElement<GetAll>(_GetAll_QNAME, GetAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getById")
    public JAXBElement<GetById> createGetById(GetById value) {
        return new JAXBElement<GetById>(_GetById_QNAME, GetById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByItemId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getByItemId")
    public JAXBElement<GetByItemId> createGetByItemId(GetByItemId value) {
        return new JAXBElement<GetByItemId>(_GetByItemId_QNAME, GetByItemId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Item }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "item")
    public JAXBElement<Item> createItem(Item value) {
        return new JAXBElement<Item>(_Item_QNAME, Item.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByBrand }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getByBrand")
    public JAXBElement<GetByBrand> createGetByBrand(GetByBrand value) {
        return new JAXBElement<GetByBrand>(_GetByBrand_QNAME, GetByBrand.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByItemIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getByItemIdResponse")
    public JAXBElement<GetByItemIdResponse> createGetByItemIdResponse(GetByItemIdResponse value) {
        return new JAXBElement<GetByItemIdResponse>(_GetByItemIdResponse_QNAME, GetByItemIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "itemsList")
    public JAXBElement<ItemList> createItemsList(ItemList value) {
        return new JAXBElement<ItemList>(_ItemsList_QNAME, ItemList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getAllResponse")
    public JAXBElement<GetAllResponse> createGetAllResponse(GetAllResponse value) {
        return new JAXBElement<GetAllResponse>(_GetAllResponse_QNAME, GetAllResponse.class, null, value);
    }

}
