package com.example.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.Emp;
import com.example.domain.Emp.Gender;

public interface EmpRepository extends JpaRepository<Emp, BigInteger>{
	
	List<Emp> findByEmpnoBetween(BigInteger left, BigInteger right);
	List<Emp> findByGenderOrderByEmpno(Gender g);
	List<Emp> findByGenderOrderByEmpnoDesc(Gender g);
	int deleteByGender(Gender g);
	List<Emp> findByEnameLike(String like);
	List<Emp> findByMgrIsNull();
}
