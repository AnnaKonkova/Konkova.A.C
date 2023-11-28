package ru.vsuet.hospital.integration.database;

import ru.vsuet.hospital.domain.Department;
import ru.vsuet.hospital.repository.DepartmentRepository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DepartmentRepositoryImpl implements DepartmentRepository {
    private Connection connection;

    public DepartmentRepositoryImpl(Connection connection) {
        this.connection = connection;
    }
    @Override
    public Department find(Long id) {
        try (Statement statement =
                     connection.createStatement()) {
            ResultSet resultSet =
                    statement.executeQuery("select * from boxes.boxes where id = " + id);
            List<Department> departments = new ArrayList<>();
            while (resultSet.next()) {
                long uid = resultSet.getLong("id");
                String title = resultSet.getString("title");
                Department department = new Department(uid, title, null);
                departments.add(department);
            }
            return departments.get(0);
        } catch (SQLException e) {
            throw new RuntimeException("Error while statement executing");
        }
    }

    @Override
    public List<Department> list() {
        try (Statement statement =
                     connection.createStatement()) {
            ResultSet resultSet =
                    statement.executeQuery("select * from department.department");
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
    public void save(Department department) {

    }

    @Override
    public void remove(Department department) {

    }
}
