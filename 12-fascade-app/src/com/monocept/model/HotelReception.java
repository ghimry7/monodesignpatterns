package com.monocept.model;

public class HotelReception {
	public void getIndianMenu(){
		IHotel indHotel=new IndianHotel();
		IMenu indMenu=indHotel.getMenu();
		indMenu.displayMenu();
	}
	
	public void getChineseMenu(){
		IHotel chHotel=new ChineseHotel();
		IMenu chMenu=chHotel.getMenu();
		chMenu.displayMenu();
	}
	
	public void getItalianMenu(){
		IHotel itHotel=new ItalianHotel();
		IMenu itMenu=itHotel.getMenu();
		itMenu.displayMenu();
	}
}
