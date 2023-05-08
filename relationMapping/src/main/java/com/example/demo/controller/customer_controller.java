package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.customer;
import com.example.demo.service.customer_service;

@RestController
@RequestMapping("/join")
public class customer_controller {
@Autowired
public customer_service cs;
@PostMapping("/post")
public String postData(@RequestBody customer c)
{
	cs.postinfo(c);
	return "data posted";
}
@GetMapping("/get")
public List<customer> getdata()
{
	return cs.get();
}
}
