package com.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")//http://localhost:8080/springmvc4.10/hello
public class HelloController {
	@RequestMapping("/say")//http://localhost:8080/springmvc4.10/hello/say
	public void say() {
		System.out.println("hello world");
	}

	@RequestMapping("/h2")
	public String h2(String uname) {
		System.out.println("uname"+uname);
		return "h2";
	}
/*	@RequestMapping("/h3")
	public String h3(HttpServletRequest request) {
		System.out.println("uname"+request.getParameter("uname"));
		
		 
	}
	@RequestMapping("/h4")
	public String h4(@RequestParam("uname")String name) {
		System.out.println("uname"+name);
}*/
}

