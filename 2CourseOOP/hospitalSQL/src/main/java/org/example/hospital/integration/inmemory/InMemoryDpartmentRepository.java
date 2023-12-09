/*
package org.example.hospital.integration.inmemory;

import org.example.hospital.domain.Department;
import org.example.hospital.domain.Patient;
import org.example.hospital.exception.DepartmentNotFoundException;
import org.example.hospital.repository.DepartmentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class InMemoryDpartmentRepository implements DepartmentRepository {

    private final Storage storage = Storage.getInstance();

    @Override
    public Department findD(Long id) {
        return storage.departments.stream()
                .filter(box -> Objects.equals(box.getId(), id))
                .findFirst()
                .orElseThrow(()->new DepartmentNotFoundException("No box found by id="+id));
    }

    @Override
    public List<Department> listD() {
        return new ArrayList<>(storage.departments);
    }
    public List<Patient> listP() {return new ArrayList<>(storage.p);}

    @Override
    public void addDepartment() {
        if (department.getId()== null) {
            department.setId(storage.departmentIdGenerator.incrementAndGet());
        }
        storage.departments.remove(department);//???
        storage.departments.add(department);

    }

    @Override
    public void addPatients(Patient patient) {
        if (patient.getId()== null) {
            patient.setId(storage.departmentIdGenerator.incrementAndGet());
        }
        storage.departments.remove(patient);//???
        storage.departments.add(patient);

    }

    @Override
    public void removeDepartment(Department department) {
        storage.departments.remove(department);

    }

    @Override
    public void addPatients(Scanner scanner) {

    }

    @Override
    public void removePatients(Patient patient) {

    }

    @Override
    public void editDepartment(Department department) {

    }

    @Override
    public void editPatients(Patient patient) {

    }

    @Override
    public void remove(Department department) {
        storage.departments.remove(department);
    }
}
*/
