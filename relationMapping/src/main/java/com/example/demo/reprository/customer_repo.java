package com.example.demo.reprository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.customer;

public interface customer_repo extends JpaRepository<customer, Integer> {

}
