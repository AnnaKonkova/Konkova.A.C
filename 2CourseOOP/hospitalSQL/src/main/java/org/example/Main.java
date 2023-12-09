package org.example;
import org.example.hospital.domain.Department;
import org.example.hospital.integration.database.ConnectionManager;
import org.example.hospital.integration.database.DepartmentRepositoryImpl;
import org.example.hospital.service.DepartmentService;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        ConnectionManager manager = new ConnectionManager();

        DepartmentService service =
                new DepartmentService(new DepartmentRepositoryImpl(manager.getConnection()));

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Выберите действие:");
            System.out.println("1. Создать отделение");
            System.out.println("2. Удалить Отделение");
            System.out.println("3. Просмотреть Отделения");
            System.out.println("4. Создать пациента");
            System.out.println("5. Удалить пациента");
            System.out.println("6. Просмотреть пациентов в отделении");
            System.out.println("0. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера чтения

            switch (choice) {
                case 1 -> service.addDepartmentt(scanner);
                case 2 -> service.removeDepartment(scanner);
                case 3 -> service.getAllDep()
                        .forEach(b -> System.out.println("Id: " + b.getId() + ", title: " + b.getTitle()));
                case 4 -> service.addPatients(scanner);
                case 5 -> service.removePatient(scanner);
                case 6 -> service.getAllPati()
                        .forEach(b -> System.out.println("Id: " + b.getId() + ", fuulName: " + b.getFuulName() + ", age: " + b.getAge() + ", gender: " + b.getGender()));
                case 0 -> running = false;
                default -> System.out.println("Некорректный выбор. Попробуйте еще раз.");
            }

            System.out.println();
        }

        scanner.close();
        manager.disconnectFromDatabase();
        System.out.println("Работа программы завершена.");


    }
}