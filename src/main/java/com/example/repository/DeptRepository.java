package com.example.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.Dept;

public interface DeptRepository extends JpaRepository<Dept, BigInteger>{

	Dept findByLoc(String loc);	//query method 
	
}
