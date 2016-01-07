package com.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.books.Book;

public class BookMapper implements RowMapper<Book> {
    @Override
	public Book mapRow(ResultSet set, int rowNum) throws SQLException {
        Book book= new Book();
        book.setBookId(set.getInt(1));
        book.setBookAuth(set.getString(2));
        book.setBookName(set.getString(3));
        book.setBookPub(set.getString(4));
        book.setEmail(set.getString(5));
		return book;
	}

}
