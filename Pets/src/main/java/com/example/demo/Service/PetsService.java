package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
		prepo.deleteById(id);
	}
	public List<Pets> sortDesc(String pname)
	{
		return prepo.findAll(Sort.by(pname).ascending());
	}
	public List<Pets> paginationData(int pageNo, int pageSize)
	{
		Page<Pets> p=prepo.findAll(PageRequest.of (pageNo, pageSize));
		return p.getContent();
	}
	public List<Pets> paginationAndSorting (int pageNo, int pageSize, String pname)
	{
		Page<Pets> p=prepo.findAll(PageRequest.of(pageNo,  pageSize, Sort.by(pname).ascending()));
		return p.getContent();
	}
	public String checkLogin(String uname,String pwd)
	{
	Pets user = prepo.findByuname(uname);
	if(user == null)
	{
		return "no user found";
	}
	else
	{
		if(user.getPwd().equals(pwd))
		{
			return "Login Successfull";
		}
		else
		{
			return "Login Failed";
		}
	}
	}
	public Pets addUser(Pets pr)
	{
		return prepo.save(pr);
	}
	public List<Pets> getUser()
	{
		return prepo.findAll();
	}
	
	
}
