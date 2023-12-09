/*
package org.example.hospital.integration.inmemory;

import org.example.hospital.domain.Department;
import org.example.hospital.domain.Patient;

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
        Patient f1 = new Patient(1L, "Дунцова Екатерина Сергеевна", 45,"Ж");
        Patient f2 = new Patient(2L, "Надеждин Борис Борисович", 20,"М");
        Patient f3 = new Patient(3L, "Явлинский Григорий Алексеевич", 56,"М");
        Patient f4 = new Patient(4L, "Стрелков Игорь Иванович", 21,"М");

        Department d1 = new Department(1L, "Department 1", List.of(f1, f2));
        Department d2 = new Department(2L, "Department 2", List.of(f3, f4));
        departments.add(d1);
        departments.add(d2);
    }
}


*/
