package com.monocept.test;
import com.monocept.model.*;
public class FascadeTest {

	public static void main(String[] args) {
		HotelReception recp=new HotelReception();
		recp.getIndianMenu();
		
		recp.getChineseMenu();
		
		recp.getItalianMenu();
	}

}
