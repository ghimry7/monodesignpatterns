package com.monocept.model;

public class BmwFactory implements IAutoMobileFactory {
	
	private static BmwFactory obj;
	
	private BmwFactory(){
		
	}
	
	public static  BmwFactory getInstance(){
		if(obj==null){
			obj=new BmwFactory();
		}
		return obj;
	}
	
	@Override
	public IAutomobile autoMake() {
		return (IAutomobile) new Bmw();
	}

}
