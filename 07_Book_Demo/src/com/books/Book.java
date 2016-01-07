package com.books;

public class Book {
	
	private String bookAuth;
	private String bookName;
	private String bookPub;
	private String email;
	private int bookId;
	
	
	public Book() {
		super();
		this.bookAuth = "John";
		this.bookName = "Learn Spring";
		this.bookPub = "ABC publications";
		this.email = "abc@abc.com";
		this.bookId = 100;
	}


	public Book(String bookAuth, String bookName, String bookPub,
			String email, int bookId) {
		super();
		this.bookAuth = bookAuth;
		this.bookName = bookName;
		this.bookPub = bookPub;
		this.email = email;
		this.bookId = bookId;
	}


	public String getBookAuth() {
		return bookAuth;
	}


	public void setBookAuth(String bookAuth) {
		this.bookAuth = bookAuth;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getBookPub() {
		return bookPub;
	}


	public void setBookPub(String bookPub) {
		this.bookPub = bookPub;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	

}
