package com.dao;

import java.sql.Connection;
import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.books.Book;

public class BookdaoSupport extends JdbcDaoSupport implements BookDAOInter {

	@Override
	public int addBook(Book book) {
		String sql="insert into day2_book values(?,?,?,?,?)";
		int r=getJdbcTemplate().update(sql, new Object[]{book.getBookId(),book.getBookAuth(),
				book.getBookName(),book.getBookPub(),book.getEmail()});
		return r;
	}

	@Override
	public boolean removeBook(int bookId) {
Connection connection =getConnection();
		return false;
	}

	@Override
	public List<Book> displayAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

}
