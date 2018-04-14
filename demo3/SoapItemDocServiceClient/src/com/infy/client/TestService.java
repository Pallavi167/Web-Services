package com.infy.client;

import java.util.*;



public class TestService {

	public static void main(String[] args) {
		
		ItemFinderServiceService ser=new ItemFinderServiceService();
		
		ItemFinder port=ser.getItemFinderServicePort();
		
		/*System.out.println("Getting Item by id 103:");
		Item i=port.getById(103);
		System.out.println("item details are:");
		System.out.println(i.getName()+"\t"+i.getBrand()+"\t"+i.getPrice());
		*/
		
		System.out.println("Fetching all items of Motorala brand:");
		ItemList brandList=port.getByBrand("Motorola");
		List<Item> mlist=brandList.items;
		Iterator<Item> itr=mlist.iterator();
		while(itr.hasNext())
		{
			Item item=itr.next();
			//System.out.println(item.getId()+"\t"+item.getName()+"\t"+item.getBrand()+"\t"+item.getPrice());
		}
		System.out.println("Fetching all items:");
		ItemList list=port.getAll();
		List<Item> itemlist=list.getItems();
		itr=itemlist.iterator();
		while(itr.hasNext())
		{
			Item item=itr.next();
			System.out.println(item.getId()+"\t"+item.getName()+"\t"+item.getBrand()+"\t"+item.getPrice());
		}
	}

}
