package com.monocept.test;

import com.monocept.model.Singleton;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		if (s1.hashCode() == s2.hashCode()) {
			System.out.println("Same");
		} else
			System.out.println("not same");
	}

}
