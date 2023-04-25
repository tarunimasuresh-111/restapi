package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Pets;
import com.example.demo.Repository.PetsRepository;

@Service
public class PetsService 
{
	@Autowired
	public PetsRepository prepo;
	//posting the information
	public  Pets saveinfo(Pets p)
	{
		return prepo.save(p);
	}
	//getting the information
	public List<Pets>getinfo()
	{
		return prepo.findAll();
	}
	//updating the information
	public Pets updateinfo(Pets pu)
	{
		return prepo.saveAndFlush(pu);
	}
	//deleting the information
	public void deleteinfo(int id)
	{
		prepo.deleteById(id);;
	}
	
	
}
