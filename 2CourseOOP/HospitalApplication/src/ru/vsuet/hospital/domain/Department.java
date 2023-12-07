package ru.vsuet.hospital.domain;

import java.util.List;
import java.util.Objects;

public class Department {
    private Long id;
    private String title;
    private List<Patient> patients;

    public Department(Long id, String title, List<Patient> patients) {
        this.id = id;
        this.title = title;
        this.patients = patients;
    }

    public Department(String title, List<Patient> patients) {
        this.title = title;
        this.patients = patients;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department box = (Department) o;
        return Objects.equals(id, box.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
