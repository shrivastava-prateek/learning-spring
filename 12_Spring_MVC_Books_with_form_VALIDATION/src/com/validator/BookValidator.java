package com.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.books.Book;

public class BookValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		return arg0.equals(Book.class);
	}

	@Override
	public void validate(Object object, Errors errors) {
        Book book = (Book)object;
        if(book.getBookName().length()<2||book.getBookName().length()>10){
        	errors.rejectValue("bookName", "name.required","please enter name of the book");
        }
        if(book.getBookPub().length()<2||book.getBookPub().length()>10){
        	errors.rejectValue("bookPub", "pub.required","please enter name of publication");
        }
        if(book.getBookAuth().length()<2||book.getBookAuth().length()>10){
           errors.rejectValue("bookAuth", "auth.required","Please Enter author");        	
        }
        if(book.getEmail().length()==0){
        	errors.rejectValue("email", "email.required", "Please Enter Email Id");
        }
        if(!(book.getEmail() !=null && book.getEmail().isEmpty())){
        	/*String EMAIL PATTERN ="^[A-Za-z0-9-\\"*/
        }
	}

}
