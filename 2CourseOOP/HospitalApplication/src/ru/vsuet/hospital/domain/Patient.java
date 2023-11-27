package ru.vsuet.hospital.domain;

import java.util.Objects;

public class Patient {
    private Long id;
    private String name;
    private int grnder;


    public Patient(Long id, String name, int grnder) {
        this(name, grnder);
        this.id = id;
    }

    public Patient(String name, int grnder) {
        this.name = name;
        this.grnder = grnder;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getGrnder() {
        return grnder;
    }

    public void setGrnder(int grnder) {
        this.grnder = grnder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient fruit = (Patient) o;
        return Objects.equals(id, fruit.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
