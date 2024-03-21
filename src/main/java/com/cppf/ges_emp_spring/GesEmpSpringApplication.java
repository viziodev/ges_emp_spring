package com.cppf.ges_emp_spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cppf.ges_emp_spring.entities.Employe;
import com.cppf.ges_emp_spring.entities.Service;
import com.cppf.ges_emp_spring.services.EmployeService;


import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class GesEmpSpringApplication implements CommandLineRunner {
	private final EmployeService employeService;
     
	public static void main(String[] args) {
		SpringApplication.run(GesEmpSpringApplication.class, args);
	  
	}

	@Override
	public void run(String... args) throws Exception {
	Service serv=Service
	.builder()
	.nomComplet("xxxxx")
	.build();
	employeService.creerService(serv);
	Employe emp=	Employe
		.builder()
		.matricule("xxxxyy")
		.nomComplet("qqqqqqq")
		.serv(serv)
		.build();
		employeService.creerEmploye(emp);
	}

}
