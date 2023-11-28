package ru.vsuet.hospital.exception;

public class DepartmentNotFoundException  extends RuntimeException{
    public DepartmentNotFoundException(String messege){
        super(messege);
    }
}
