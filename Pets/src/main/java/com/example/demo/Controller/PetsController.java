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
import com.example.demo.Repository.PetsRepository;
import com.example.demo.Service.PetsService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class PetsController 
{
	@Autowired
	public PetsService pser;
	@Autowired
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
    public List<Pets> pagina(@PathVariable ("no") int no, @PathVariable("siz") int siz,@PathVariable("name") String name)
    {
    	return pser.paginationAndSorting(no, siz, name);
    }
    
    
    @Tag(name="Native Query",description = "Getting Details")
    @GetMapping("/getByNative")
	public List<Pets> fetchAllPets(){
		return prepo.getAllData();
	}
	
	@Tag(name="Native Query",description="Delete by id")
	@DeleteMapping("deleteNative/{pid}")
	public String deleteNative(@PathVariable("pid") int pid)
	{
		prepo.deleteById(pid);
		return "Deleted By NativeQuery";
	}
	
	@Tag(name="Native Query",description = "Update Details ")
	@PutMapping("updateNative/{page}/{pname}")
	public String updateQuery(@PathVariable("page") String page,@PathVariable("pname") String pname)
	{
	   prepo.updateQuery(page, pname);
		return "updated Suucessfully";
		
	}
 
	@Tag(name="Native Query",description = "get DEtails by pname")
	@GetMapping("/jpql/{pname}")
	public List<Pets> updatejpql(@PathVariable("pname") String pname){
		return prepo.get(pname);
	}
    
    
}
