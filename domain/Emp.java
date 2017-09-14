package com.example.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {
	
	public enum Gender {
		M, F;
	}
	@Id
	@Column(precision=4)
	private BigInteger empno;
	@Column(length=10, nullable=false)
	private String ename;
	@Enumerated(EnumType.STRING)
	@Column(length=1)
	private Gender gender;
	@Column(length=9)
	private String job;
	private Integer mgr;
	@Temporal(TemporalType.DATE)
	private Date hiredate;
	private BigDecimal sal;
	private BigDecimal comm;
	private Integer deptno;
}
