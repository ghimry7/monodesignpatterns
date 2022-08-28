package com.monocept.publisher;

import java.util.ArrayList;

import com.monocept.subscriber.INotifier;

public class Accounts {
	private int accNumber;
	private String name;
	private double balance;
	private ArrayList<INotifier> notify;
	
	public Accounts(int accNumber, String name, double balance) {
		super();
		this.accNumber = accNumber;
		this.name = name;
		this.balance = balance;
		notify=new ArrayList<>();
	}
	public int getAccNumber() {
		return accNumber;
	}
	public String getName() {
		return name;
	}
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount){
		balance+=amount;
		for(INotifier x:notify){
			x.notifyUser(this,"deposit");
		}
	}
	
	public void withdraw(double amount){
		if(balance>=amount){
			balance-=amount;
			for(INotifier x:notify){
				x.notifyUser(this,"withdraw");
			}
		}
		else{
			System.out.println("Insufficient Balance!!!");
		}
	}
	
	public void registerNotifier(INotifier notifier){
		notify.add(notifier);
		
	}
	
	
}
