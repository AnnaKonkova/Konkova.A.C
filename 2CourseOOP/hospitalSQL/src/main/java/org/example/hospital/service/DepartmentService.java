package org.example.hospital.service;

import org.example.hospital.domain.Patient;
import org.example.hospital.integration.database.DepartmentRepositoryImpl;
import org.example.hospital.domain.Department;
import org.example.hospital.repository.DepartmentRepository;

import java.util.List;
import java.util.Scanner;

public class DepartmentService {
    private final DepartmentRepository repository;

    public DepartmentService(DepartmentRepositoryImpl repository) {
        this.repository = repository;
    }

    public Department getByIdDep(Long id) {return repository.findD(id);}
    public void addDepartmentt(Scanner scanner){
        repository.addDepartment();
    }
    public void addPatients(Scanner scanner){repository.addPatients();}
    public void removeDepartment(Scanner scanner){repository.removeDepartment();}
    public void removePatient(Scanner scanner){repository.removePatients();}

    public List<Department> getAllDep() {
        return repository.listD();
    }
    public List<Patient> getAllPati() {return repository.listP();}
}
