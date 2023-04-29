package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Pets;
@Repository
public interface PetsRepository extends JpaRepository<Pets, Integer> {
	Pets findByuname(String uname);
 
	
}
