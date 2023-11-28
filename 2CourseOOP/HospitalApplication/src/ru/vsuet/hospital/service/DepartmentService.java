package ru.vsuet.hospital.service;

import ru.vsuet.hospital.domain.Department;
import ru.vsuet.hospital.repository.DepartmentRepository;

import java.util.List;

public class DepartmentService {
    private final DepartmentRepository repository;

    public DepartmentService(DepartmentRepository repository) {
        this.repository = repository;
    }

    public Department getById(Long id) {
        return repository.find(id);
    }

    public List<Department> getAll() {
        return repository.list();
    }
}
