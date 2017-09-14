package com.example.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.City;
import com.example.domain.Dept;

public interface CityRepository extends JpaRepository<City, BigInteger>{

}
