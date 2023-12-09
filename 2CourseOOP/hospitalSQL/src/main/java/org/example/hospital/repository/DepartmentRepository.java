package org.example.hospital.repository;

import org.example.hospital.domain.Department;
import org.example.hospital.domain.Patient;

import java.util.List;
import java.util.Scanner;

//контракт
public interface DepartmentRepository {

    Department findD(Long id);
    List<Department>listD();
    List<Patient>listP();
    void addDepartment();

    void removeDepartment( );

    void addPatients();

    void removePatients( );

}
