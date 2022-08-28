package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
	private String shopName;
	List<Book> books = new ArrayList<>();

	public BookShop(String shopName) {
		super();
		this.shopName = shopName;
	}

	public BookShop() {
		
	}

	public String getShopName() {
		return shopName;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public void load() {
		for (int i = 0; i < 5; i++) {
			Book b = new Book(i, "Book " + i);
			books.add(b);
		}
	}

	@Override
	public BookShop clone() throws CloneNotSupportedException {
		BookShop b = new BookShop();
		for (Book x : getBooks()) {
			b.getBooks().add(x);
		}
		return b;
	}

	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", books=" + books + "]";
	}

}
