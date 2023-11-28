package ru.vsuet.hospital.integration.inmemory;

import ru.vsuet.hospital.domain.Department;
import ru.vsuet.hospital.domain.Patient;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

public class Storage {
    private static Storage instance;

    public static Storage getInstance() {
        if (instance == null) {
            instance = new Storage();
        }
        return instance;
    }

    Set<Department> departments;
    final AtomicLong departmentIdGenerator = new AtomicLong(4);

    public Storage() {
        departments = new HashSet<>();
        initBoxes();
    }

    private void initBoxes() {
        Patient f1 = new Patient(1L, "appl1", 100);
        Patient f2 = new Patient(2L, "appl2", 100);
        Patient f3 = new Patient(3L, "appl3", 100);
        Patient f4 = new Patient(4L, "appl4", 100);

        Department d1 = new Department(1L, "box 1", List.of(f1, f2));
        Department d2 = new Department(2L, "box 2", List.of(f3, f4));
        departments.add(d1);
        departments.add(d2);
    }
}


