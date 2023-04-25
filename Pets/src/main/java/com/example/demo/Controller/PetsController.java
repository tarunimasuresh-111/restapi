package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Pets;
import com.example.demo.Service.PetsService;

@RestController
public class PetsController 
{
	@Autowired
	public PetsService pser;
	@PostMapping("/Pets")
	public Pets addDetails(@RequestBody Pets pr)
	{
		return pser.saveinfo(pr);
	}
    @GetMapping("/Petsget")
    public List<Pets> getDetails()
    {
    	return pser.getinfo();
    }
    @PutMapping("/Petsupdate")
    public Pets update(@RequestBody Pets ID)
    {
    	return pser.updateinfo(ID);
    }
    @DeleteMapping("/deletePets/{id}")
    public String deletepets(@PathVariable("id") int pid)
    {
    	pser.deleteinfo(pid);
    	return "deleted";
    }
    @DeleteMapping("/deleteByReq")
    public String deleteByRequestPara(@RequestParam ("id") int petid)
    {
    	pser.deleteinfo(petid);
    	return petid+" is deleted";
    }
    

}
