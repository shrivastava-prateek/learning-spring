package com.main;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.books.Book;
import com.dao.BookDAOInter;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		/*BookDAOInter bookDao = (BookDAOInter)context.getBean("bookdao");*/
		BookDAOInter bookDao = (BookDAOInter)context.getBean("booktemplate");
		int r=bookDao.addBook(new Book(9,"coreJava","Auth1","my pub","one.one.com"));
		if(r>0){
			System.out.println(r+" record inserted");
		}
		else{
			System.out.println("record not inserted");
		}
		
		/*if(bookDao.removeBook(3)){
			System.out.println("Book deleted");
		}
		else{
			System.out.println("book is not removed");
		}*/
		
		List<Book> books =bookDao.displayAllBooks();
		System.out.println("Book Id \t   BookName \t   Book Auth \t   Book Pub \t   Email");
		for(Book book:books){
			System.out.println(book);
		}
		
		
	}

}
