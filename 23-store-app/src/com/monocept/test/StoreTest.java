package com.monocept.test;
import com.monocept.model.*;
public class StoreTest {

	public static void main(String[] args) {
		Product banana=new Product(1,"banana",60,0.2);
		Product shirts=new Product(2,"shirt",500,0.25);
		
		LineItem item1=new LineItem(1,5,banana);
		LineItem item2=new LineItem(2,3,shirts);
		
		
		Order o1=new Order(11,"2/02/2022");
		o1.addLineItem(item1);
		o1.addLineItem(item2);
		
		Product oil=new Product(78,"oil",180,0.3);
		Product rice=new Product(2,"rice",60,0.15);
		
		LineItem item3=new LineItem(3,4,oil);
		LineItem item4=new LineItem(4,6,rice);
		
		
		Order o2=new Order(12,"2/02/2022");
		o2.addLineItem(item3);
		o2.addLineItem(item4);
		
		Customer c1=new Customer(101,"Raju");
		c1.addOrder(o1);
		c1.addOrder(o2);
		
		c1.dispCust();
	
		
		
		
	}

}
