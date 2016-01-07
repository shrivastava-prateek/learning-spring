package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.books.Book;

@Controller
public class MyController {
@RequestMapping("welcome")
  public String myMethod(HttpServletRequest request){
	  return("Hello.jsp");
  }
/*@RequestMapping("addBook")
  public String addBook(HttpServletRequest request){
	int bookId = Integer.parseInt(request.getParameter("bookId"));
	String bookName = request.getParameter("bookName");
	String bookAuthor = request.getParameter("bookAuth");
	String bookPub = request.getParameter("bookPub");
	String email = request.getParameter("email");
	
	Book book = new Book(bookId,bookName,bookAuthor,bookPub,email);
	request.setAttribute("book", book);
	return("ShowBook.jsp");
	
}*/
@RequestMapping("addBook")
public ModelAndView addBook(HttpServletRequest request){
	int bookId = Integer.parseInt(request.getParameter("bookId"));
	String bookName = request.getParameter("bookName");
	String bookAuthor = request.getParameter("bookAuth");
	String bookPub = request.getParameter("bookPub");
	String email = request.getParameter("email");
	
	Book book = new Book(bookId,bookName,bookAuthor,bookPub,email);
	//request.setAttribute("book", book);
	return new ModelAndView("ShowBook","book",book);
	
}
}
