package com.cppf.ges_emp_spring.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cppf.ges_emp_spring.entities.Employe;
public interface EmployeRepository extends JpaRepository<Employe,Long> {
  Optional <Employe> findByMatricule(String matr) ;
}
