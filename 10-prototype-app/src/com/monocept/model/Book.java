package com.monocept.model;

public class Book {
	private int bookId;
	private String bookName;
	
	public Book(int bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}
	public int getBookId() {
		return bookId;
	}
	public String getBookName() {
		return bookName;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + "]";
	}
	
	
}
