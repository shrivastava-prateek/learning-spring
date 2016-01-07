package com.dao;

import java.util.List;

import com.books.Book;

public interface BookDAOInter {
	int addBook(Book book);
	boolean removeBook(int bookId);
	List<Book> displayAllBooks();
}
