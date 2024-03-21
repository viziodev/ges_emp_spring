package com.cppf.ges_emp_spring.services;

import java.util.List;

import com.cppf.ges_emp_spring.entities.Employe;
import com.cppf.ges_emp_spring.entities.Service;


public interface EmployeService {
     void creerEmploye(Employe emp);
     List<Employe>  listeEmploye();
     Employe  rechercherEmployeParMatricule(String matricule);
     void creerService(Service service);
     List<Service>  listeService(); 
     Service  rechercherParId(Long id);

}
