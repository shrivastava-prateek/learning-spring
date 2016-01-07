package com.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.books.Book;


public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		DriverManagerDataSource source = (DriverManagerDataSource) context.getBean("source");
		Connection connection=null;
		try {
			 connection = source.getConnection();
			System.out.println("got connection");
			
			Book book =new Book("Spring New","abcd xyz","My Pub ,Nagpur","abcd@efg.com",123);
			String sql="insert into day2_book values(?,?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, book.getBookId());
			ps.setString(2,book.getBookName());
			ps.setString(3, book.getBookAuth());
			ps.setString(4,book.getBookPub());
			ps.setString(5, book.getEmail());
			int rec = ps.executeUpdate();
			System.out.println(rec+"book added successfully");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
