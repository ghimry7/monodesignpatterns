package com.monocept.test;

import com.monocept.model.*;

public class StrategyTest {

	public static void main(String[] args) {
		Employee e1 = new Employee(01, "Mono", new Consultant());
		disp(e1);
		System.out.println("----------------");

		e1.promote(new SeniorConsultant());
		disp(e1);
		System.out.println("----------------");
		
		e1.promote(new TechLead());
		disp(e1);

	}

	public static void disp(Employee emp) {
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getDescription());
		System.out.println(emp.getResponsibility());
	}

}
