package com.example.demo.controller;


import java.util.List;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class SampleController {
	@GetMapping("/hello")
	public void hello(Model model) {
		log.info("hello.............");
		model.addAttribute("msg","Hello World");
	}
	
	@GetMapping("/ex/ex1")
	public void ex1(Model model) {
		String[] arr =  {"AAAA","BBBBB","CCCCC","DDDDD"};
		List<String> list = (Arrays.asList(arr));
		model.addAttribute("list",list);
	}

	@GetMapping("/ex/ex3")
	public void ex3(Model model){
		model.addAttribute("arr", new String[]{"AAA","BBB","CCC"});
	}
}
