package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
@RequestMapping("welcome")
  public String myMethod(HttpServletRequest request){
	  return("Hello.jsp");
  }
}
