package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.customer;
import com.example.demo.reprository.customer_repo;

@Service
public class customer_service {
	@Autowired
	public customer_repo cr;
	public void postinfo(customer c)
	{
		cr.save(c);
	}
	public List<customer> get()
	{
		return cr.findAll();
	}
}
