package com.monocept.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.monocept.model.Singleton;

public class SingletonTest {

	public static void main(String[] args) {
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				try {
					FileOutputStream file = new FileOutputStream("./test.bin");
					ObjectOutputStream out = new ObjectOutputStream(file);
					Singleton s1 = Singleton.getInstance();
					System.out.println(s1.hashCode());
					out.writeObject(s1);

					FileInputStream file1 = new FileInputStream("./test.bin");
					ObjectInputStream in = new ObjectInputStream(file1);
					Singleton s2 = (Singleton) in.readObject();
					System.out.println(s2.hashCode());
					
					out.close();
					file.close();
					in.close();
					file1.close();
				} catch (IOException | ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		};
		Thread t1 = new Thread(r1);
		t1.start();

		Runnable r2 = new Runnable() {

			@Override
			public void run() {
				try {
					FileOutputStream file = new FileOutputStream("./test.bin");
					ObjectOutputStream out = new ObjectOutputStream(file);
					Singleton s1 = Singleton.getInstance();
					System.out.println(s1.hashCode());
					out.writeObject(s1);

					FileInputStream file1 = new FileInputStream("./test.bin");
					ObjectInputStream in = new ObjectInputStream(file1);
					Singleton s2 = (Singleton) in.readObject();
					System.out.println(s2.hashCode());
					
					out.close();
					file.close();
					in.close();
					file1.close();
				} catch (IOException | ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		};
		Thread t2 = new Thread(r2);
		t2.start();

		Runnable r3 = new Runnable() {

			@Override
			public void run() {
				try {
					FileOutputStream file = new FileOutputStream("./test.bin");
					ObjectOutputStream out = new ObjectOutputStream(file);
					Singleton s1 = Singleton.getInstance();
					System.out.println(s1.hashCode());
					out.writeObject(s1);

					FileInputStream file1 = new FileInputStream("./test.bin");
					ObjectInputStream in = new ObjectInputStream(file1);
					Singleton s2 = (Singleton) in.readObject();
					System.out.println(s2.hashCode());
					
					out.close();
					file.close();
					in.close();
					file1.close();
				} catch (IOException | ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		};
		Thread t3 = new Thread(r3);
		t3.start();

		Runnable r4 = new Runnable() {

			@Override
			public void run() {
				try {
					FileOutputStream file = new FileOutputStream("./test.bin");
					ObjectOutputStream out = new ObjectOutputStream(file);
					Singleton s1 = Singleton.getInstance();
					System.out.println(s1.hashCode());
					out.writeObject(s1);

					FileInputStream file1 = new FileInputStream("./test.bin");
					ObjectInputStream in = new ObjectInputStream(file1);
					Singleton s2 = (Singleton) in.readObject();
					System.out.println(s2.hashCode());
					
					out.close();
					file.close();
					in.close();
					file1.close();
				} catch (IOException | ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		};
		Thread t4 = new Thread(r4);
		t4.start();

	}

}
