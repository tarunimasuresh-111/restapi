package com.example.demo.ex1;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Ehhh {
	@Value("${carname:audi}")
	public String car;
	@GetMapping("/value")
	@ResponseBody
	public String ex1()
	{
		return"the model of the car is "+car;
	}
	

}
