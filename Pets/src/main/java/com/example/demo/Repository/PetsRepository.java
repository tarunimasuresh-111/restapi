package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Pets;

public interface PetsRepository extends JpaRepository<Pets, Integer> {

}
