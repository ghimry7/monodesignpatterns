package com.monocept.test;
import com.monocept.publisher.*;
import com.monocept.subscriber.*;
public class ObserverTest {

	public static void main(String[] args) {
		Accounts acc1=new Accounts(123,"Java",5000);
		acc1.registerNotifier(new SmsNotifier());
		acc1.registerNotifier(new EmailNotifier());
		acc1.withdraw(2000);
		
		Accounts acc2=new Accounts(323,"Python",5000);
		acc2.registerNotifier(new SmsNotifier());
		acc2.deposit(2000);
		
	}

}
