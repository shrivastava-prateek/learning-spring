package com.books;

public class Book {
	private int bookId;
	private String bookName;
	private String bookAuth;
	private String bookPub;
	private String email;
	
	
	/*
	public Book() {
		super();
		this.bookId = 100;
		this.bookAuth = "John";
		this.bookName = "Learn Spring";
		this.bookPub = "ABC publications";
		this.email = "abc@abc.com";
		
	}

*/
	


	public Book(int bookId, String bookName, String bookAuth, String bookPub,
			String email) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuth = bookAuth;
		this.bookPub = bookPub;
		this.email = email;
	}





	public Book() {
		super();
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





	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName
				+ ", bookAuth=" + bookAuth + ", bookPub=" + bookPub
				+ ", email=" + email + "]";
	}


	
}
