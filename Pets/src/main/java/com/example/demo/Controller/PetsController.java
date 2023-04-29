package com.example.demo.Controller;

import java.util.List;
import java.util.Map;

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
import com.example.demo.Repository.PetsRepository;
import com.example.demo.Service.PetsService;

@RestController
public class PetsController 
{
	@Autowired
	public PetsService pser;
	public PetsRepository prepo;
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
    @GetMapping("/sortDesc/{pname}")
    public List<Pets> sortpname(@PathVariable("pname") String pname)
    {
    	return pser.sortDesc(pname);
    }
    @GetMapping("/pagination/{pid}/{porigin}")
    public List <Pets> paginationData(@PathVariable("pid") int pid, @PathVariable("porigin")int porigin)
    {
    	return pser.paginationData(pid,porigin);
    }
    @GetMapping("/pag/{no}/{siz}/{name}")
    public List<Pets> pagina(@PathVariable ("nu") int no, @PathVariable("siz") int siz,@PathVariable("name") String name)
    {
    	return pser.paginationAndSorting(no, siz, name);
    }
    @PostMapping("/login")
    public String login(@RequestBody Map<String, String> loginData)
    {
    	String uname =loginData.get("uname");
    	String pwd=loginData.get("pwd");
    	String result=pser.checkLogin(uname, pwd);
    	return result;
    }
    @PostMapping("/adduser")
    public Pets AddUser(@RequestBody Pets pr)
    {
    	return pser.addUser(pr);
    }
    @GetMapping
    public List<Pets> listAll()
    {
    	return pser.getUser();
    }
    
   

}
