package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.books.Book;
import com.dao.BookDAOInter;

@Controller
public class MyBookController {
	@Autowired
  private BookDAOInter bookdao;
  @Autowired
  Validator validator;
  
	public Validator getValidator() {
	return validator;
}

public void setValidator(Validator validator) {
	this.validator = validator;
}

	public BookDAOInter getBookdao() {
	return bookdao;
}

public void setBookdao(BookDAOInter bookdao) {
	this.bookdao = bookdao;
}

	@RequestMapping("/showForm")
	public ModelAndView showBookForm(ModelMap map)throws Exception{
		Book book = new Book();
		map.addAttribute(book);
		return new ModelAndView("bookForm");
	}
	
	/*@RequestMapping("/addBook")
	public ModelAndView addBook(@ModelAttribute("book")Book book)throws Exception{
		bookdao.addBook(book);
		System.out.println("Adding Book");
		return new ModelAndView("ShowBook","book",book);
	}*/
	
	@RequestMapping("/addBook")
	public ModelAndView addBook(@ModelAttribute("book")Book book,BindingResult result)throws Exception{
		validator.validate(book, result);
		if(result.hasErrors()){
			return new ModelAndView("bookForm");
		}
		bookdao.addBook(book);
		System.out.println("Adding Book");
		return new ModelAndView("ShowBook","book",book);
	}
}
