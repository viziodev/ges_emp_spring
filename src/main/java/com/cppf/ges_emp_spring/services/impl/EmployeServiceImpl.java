package com.cppf.ges_emp_spring.services.impl;

import java.util.List;

import com.cppf.ges_emp_spring.entities.Employe;
import com.cppf.ges_emp_spring.entities.Service;
import com.cppf.ges_emp_spring.repository.EmployeRepository;
import com.cppf.ges_emp_spring.repository.ServiceRepository;
import com.cppf.ges_emp_spring.services.EmployeService;

import lombok.RequiredArgsConstructor;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class EmployeServiceImpl implements EmployeService {
    private final EmployeRepository employeRepository;
    private  final ServiceRepository serviceRepository; 
    
    @Override
    public void creerEmploye(Employe emp) {
        employeRepository.save(emp);
    }

    @Override
    public List<Employe> listeEmploye() {
       return employeRepository.findAll();
    }

    @Override
    public Employe rechercherEmployeParMatricule(String matricule) {
         return employeRepository.findByMatricule(matricule).orElse(null);
    }

    @Override
    public void creerService(Service service) {
         serviceRepository.save(service);
    }

    @Override
    public List<Service> listeService() {
       return serviceRepository.findAll();
    }

    @Override
    public Service rechercherParId(Long id) {
       return serviceRepository.findById(id).orElse(null);
    }
    
}
