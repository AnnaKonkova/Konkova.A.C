package org.example.hospital.integration.database;

import org.example.hospital.domain.Department;
import org.example.hospital.domain.Patient;
import org.example.hospital.repository.DepartmentRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DepartmentRepositoryImpl implements DepartmentRepository {

    private Connection connection;
    Scanner scanner = new Scanner(System.in);

    public DepartmentRepositoryImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void addDepartment() {
        System.out.println("Введите название отделения:");
        String title = scanner.nextLine();

        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO department_table (title) VALUES (?)");
            statement.setString(1, title);
            statement.executeUpdate();
            statement.close();
            System.out.println("Отделение успешно созданно.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void removeDepartment( ) {
        System.out.println("Введите название отделения для удаления:");
        String title = scanner.nextLine();

        try {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM department_table WHERE title = ?");
            statement.setString(1, title);
            int rowsAffected = statement.executeUpdate();
            statement.close();

            if (rowsAffected > 0) {
                System.out.println("Отделение успешно удалено.");
            } else {
                System.out.println("Отделение не найдено.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Department> listD() {
        try (Statement statement =
                     connection.createStatement()) {
            ResultSet resultSet =
                    statement.executeQuery("SELECT * FROM department_table");
            List<Department> departments = new ArrayList<>();
            while (resultSet.next()) {
                long id = resultSet.getLong("id");
                String title = resultSet.getString("title");
                Department department = new Department(id, title, null);
                departments.add(department);
            }
            return departments;
        } catch (SQLException e) {
            throw new RuntimeException("Error while statement executing");
        }
    }

    @Override
    public Department findD(Long id) {
        try (Statement statement =
                     connection.createStatement()) {
            ResultSet resultSet =
                    statement.executeQuery("SELECT * FROM department_table WHERE department_id = " + id);
            List<Department> departments = new ArrayList<>();
            while (resultSet.next()) {
                long uid = resultSet.getLong("id");
                String title = resultSet.getString("title");
                /*int countOfPatients = resultSet.getInt("countOfPatients");*/
                Department department = new Department(uid, title,null);
                departments.add(department);
            }
            return departments.get(0);
        } catch (SQLException e) {
            throw new RuntimeException("Error while statement executing");
        }
    }
    @Override
    public void addPatients() {
        System.out.println("Введите название отделения, в которое добавить пациента: ");
        String title = scanner.nextLine();

        List<Department> departmentNames = listD();

        if (departmentNames.contains(title)) {
            System.out.println("Введите имя пациента:");
            String fuulName = scanner.nextLine();
            int age = scanner.nextInt();
            String gender = scanner.nextLine();

            try {
                PreparedStatement statement = connection.prepareStatement("INSERT INTO patient_table (id, fuulName, age, gender, department_title) VALUES (?, ?, ?, ?, ?)");
                statement.setString(1, fuulName);
                statement.setInt(2, age);
                statement.setString(3, gender);
                statement.setString(4, title);
                /*department.setCountOfPatients(department.getCountOfPatients()+1);*/
                statement.executeUpdate();
                statement.close();
                System.out.println("пациент  успешно добавлен в отделение.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Отделение не найдено.");
        }

    }
    @Override
    public void removePatients( ) {
        System.out.println("Введите ФИО пациента для удаления:");
        String fuulName = scanner.nextLine();
        int age = scanner.nextInt();
        String gender = scanner.nextLine();
        try {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM patient_table WHERE fuulName = ?");
            statement.setString(1, fuulName);
          /*  statement.setInt(2, age);
            statement.setString(3, gender);*/

            int rowsAffected = statement.executeUpdate();
            statement.close();
            if (rowsAffected > 0) {
                System.out.println("Пациент успешно удален.");
            } else {
                System.out.println("Пациент не найден.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public List<Patient> listP() {
        System.out.println("Список пациентов:");
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM patient_table WHERE department_title = ?");
            List<Patient> patients = new ArrayList<>();
            while (resultSet.next()) {
                long id = resultSet.getLong("id");
                String fuulName = resultSet.getString("fuulName");
                int age = resultSet.getInt("age");
                String gender = resultSet.getString("gender");
                Patient patient = new Patient(id, fuulName, age,gender,null);
                patients.add(patient);
            }
            return patients ;
        } catch (SQLException e) {
            throw new RuntimeException("Error while statement executing");
        }
    }


}