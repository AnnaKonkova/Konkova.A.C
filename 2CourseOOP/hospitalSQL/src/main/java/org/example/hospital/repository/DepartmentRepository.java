package org.example.hospital.repository;

import org.example.hospital.domain.Department;
import org.example.hospital.domain.Patient;

import java.util.List;

//контракт
public interface DepartmentRepository {

    String findD();
    List<Department>listD();
    List<Patient>listP();
    void addDepartment();

    void removeDepartment( );

    void addPatients();

    void removePatients( );

}
