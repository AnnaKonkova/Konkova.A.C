package ru.vsuet.hospital.integration.inmemory;

import ru.vsuet.hospital.domain.Department;
import ru.vsuet.hospital.exception.DepartmentNotFoundException;
import ru.vsuet.hospital.repository.DepartmentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class InMemoryDpartmentRepository implements DepartmentRepository {

    private final Storage storage = Storage.getInstance();

    @Override
    public Department find(Long id) {
        return storage.departments.stream()
                .filter(box -> Objects.equals(box.getId(), id))
                .findFirst()
                .orElseThrow(()->new DepartmentNotFoundException("No box found by id="+id));
    }

    @Override
    public List<Department> list() {
        return new ArrayList<>(storage.departments);
    }

    @Override
    public void save(Department department) {
        if (department.getId()== null) {
            department.setId(storage.departmentIdGenerator.incrementAndGet());
        }
        storage.departments.remove(department);//???
        storage.departments.add(department);
    }

    @Override
    public void remove(Department department) {
        storage.departments.remove(department);

    }

}
