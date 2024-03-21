package com.cppf.ges_emp_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.cppf.ges_emp_spring.entities.Service;

public interface ServiceRepository extends JpaRepository<Service,Long> {
    
}
