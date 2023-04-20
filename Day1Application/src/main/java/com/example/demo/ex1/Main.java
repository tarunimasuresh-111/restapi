package com.example.demo.ex1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Main {
	
	@GetMapping("/")
	@ResponseBody
	public String Welcome()
	{
		return "Welcome!";
	}
	
}
