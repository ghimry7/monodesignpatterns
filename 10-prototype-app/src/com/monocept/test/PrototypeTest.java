package com.monocept.test;

import com.monocept.model.BookShop;

public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		BookShop bs1=new BookShop("Java");
		bs1.load();
		
		BookShop bs2=bs1.clone();
		bs2.setShopName("Python");
		
		bs1.getBooks().remove(1);
		
		
		
		System.out.println(bs1);
		System.out.println(bs2);
		
		System.out.println(bs1.hashCode());
		System.out.println(bs2.hashCode());
		
		
		
	}

}
