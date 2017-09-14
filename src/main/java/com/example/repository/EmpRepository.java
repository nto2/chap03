package com.example.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.Emp;

public interface EmpRepository extends JpaRepository<Emp, BigInteger>{

}
