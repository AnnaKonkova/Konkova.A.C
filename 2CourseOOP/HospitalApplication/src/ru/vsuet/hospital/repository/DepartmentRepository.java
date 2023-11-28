package ru.vsuet.hospital.repository;

import ru.vsuet.hospital.domain.Department;

import java.util.List;

//контракт
public interface DepartmentRepository {
    Department find(Long id);
    List<Department>list();
    void save(Department department);
    void remove(Department department);
}
