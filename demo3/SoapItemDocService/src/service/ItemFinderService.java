package service;

import java.util.*;

import javax.jws.WebService;

import models.Item;
import models.ItemList;

@WebService(endpointInterface="service.ItemFinder",targetNamespace="http://infy/services")

public class ItemFinderService implements ItemFinder {

	ArrayList<Item> b1,b2,b3;
	HashMap<Integer, Item> idMap;
	public ItemFinderService()
	{
		Item i1,i2,i3,i4,i5,i6,i7,i8;
		b1=new ArrayList<Item>();
		b1.add(i1=new Item(101,"16GB Pen Drive","iball",500));
		b1.add(i2=new Item(102,"64GB Memory card","iball",1200));
		b1.add(i3=new Item(103,"Optical Mouse","iball",450));
		b2=new ArrayList<Item>();
		b2.add(i4=new Item(104,"MI3","XIOMI",14000));
		b2.add(i5=new Item(105,"Redmi 1s","XIOMI",6000));
		b3=new ArrayList<Item>();
		b3.add(i6=new Item(106,"Moto G","Motorola",15000));
		b3.add(i7=new Item(107,"Moto E","Motorola",7000));
		b3.add(i8=new Item(108,"Moto X","Motorola",22000));
		idMap=new HashMap<Integer,Item>();
		idMap.put(101,i1);
		idMap.put(102,i2);
		idMap.put(103,i3);
		idMap.put(104,i4);
		idMap.put(105,i5);
		idMap.put(106,i6);
		idMap.put(107,i7);
		idMap.put(108,i8);
		
	}
	@Override
	public Item getById(int id) {
		System.out.println("ItemFinderService.getById()");
		return idMap.get(id);
	}
	
	@Override
	public Item getByItemId(int id) {
		System.out.println("ItemFinderService.getByItemId()");
		return idMap.get(id);
	}
	
	@Override
	public ItemList getByBrand(String brand) {
		ItemList list=new ItemList();
		if(b1.get(0).getBrand().equalsIgnoreCase(brand))
			list.setItemList(b1);
		else if(b2.get(0).getBrand().equalsIgnoreCase(brand))
			list.setItemList(b2);
		else if(b3.get(0).getBrand().equalsIgnoreCase(brand))
			list.setItemList(b3);
		
		return list;
	}
	
	@Override
	public ItemList getAll() {
		ArrayList<Item> all=new ArrayList<Item>();
		all.addAll(b1);
		all.addAll(b2);
		all.addAll(b3);
		ItemList list=new ItemList();
		list.setItemList(all);
		return list;
	}

}
