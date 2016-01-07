package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.books.Book;

public class BookDAO implements BookDAOInter {
	private DriverManagerDataSource dataSource;


	public DriverManagerDataSource getDataSource() {
		return dataSource;
	}


	public void setDataSource(DriverManagerDataSource dataSource) {
		this.dataSource = dataSource;
	}


	@Override
	public int addBook(Book book) {
        int rec=0;
		try {
			Connection connection = dataSource.getConnection();
			String sql="insert into day2_book values(?,?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, book.getBookId());
			ps.setString(2,book.getBookAuth());
			ps.setString(3,book.getBookName() );
			ps.setString(4,book.getBookPub());
			ps.setString(5, book.getEmail());
			rec = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rec;
	}


	@Override
	public boolean removeBook(int bookId) {
		boolean inserted=false;
		try {
			Connection connection = dataSource.getConnection();
			String sql ="delete from day2_book where bookId =?";
			PreparedStatement ps= connection.prepareStatement(sql);
			ps.setInt(1,bookId);
			int r=ps.executeUpdate();
			if(r>0){
				inserted= true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return inserted;
	}


	@Override
	public List<Book> displayAllBooks() {
		List<Book> books = new ArrayList<Book>();
		try {
			Book b=null;
			Connection connection = dataSource.getConnection();
			String sql ="select * from day2_book";
			PreparedStatement ps= connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				b = new Book(rs.getInt(1),rs.getString(3),rs.getString(2),rs.getString(4),rs.getString(5));
				books.add(b);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return books;
	}

}
