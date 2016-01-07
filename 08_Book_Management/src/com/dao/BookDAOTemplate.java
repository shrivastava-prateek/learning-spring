package com.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.books.Book;
import com.mapper.BookMapper;
public class BookDAOTemplate implements BookDAOInter {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	@Transactional(readOnly=true)
	public int addBook(Book book) {
		String sql="insert into day2_book values(?,?,?,?,?)";
		int r=jdbcTemplate.update(sql, new Object[]{book.getBookId(),book.getBookAuth(),
				book.getBookName(),book.getBookPub(),book.getEmail()});
		return r;
	}

	@Override
	public boolean removeBook(int bookId) {
		boolean deleted=false;
		String sql="delete from day2_book where bookId = ?";
		int r= jdbcTemplate.update(sql, bookId);
		if(r>0){
			deleted = true;
		}else deleted=false;
		return deleted;
	}

	@Override
	public List<Book> displayAllBooks() {
		String sql="select * from day2_book";
        List<Book> books = jdbcTemplate.query(sql, new BookMapper());
		return books;
	}

}
