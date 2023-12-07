package ru.vsuet.hospital.integration.database;

import ru.vsuet.hospital.domain.Department;
import ru.vsuet.hospital.integration.inmemory.ResultSetMapper;
import ru.vsuet.hospital.repository.DepartmentRepository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class DepartmentRepositoryImpl implements DepartmentRepository {

    private Connection connection;
    private ResultSetMapper<Department> departmentResultSetMapper =
            resultSet -> {
                long uid = resultSet.getLong("id");
                String title = resultSet.getString("title");
                return new Department(uid, title, null);
            };

    public DepartmentRepositoryImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Department find(Long id) {
        List<Department> boxes = executeSelect("select * from boxes.boxses id =" + id, departmentResultSetMapper);
        if (boxes.isEmpty()) {
            throw new RuntimeException("No element found");

        }
        return boxes.get(0);
    }

    @Override
    public List<Department> list() {

        List<Department> boxes = executeSelect("select * from boxes.boxes", departmentResultSetMapper);
        return boxes;
    }

    @Override
    public void save(Department box) {

    }

    @Override
    public void remove(Department box) {

    }

    private <T> List<T> executeSelect(
            String sqlSelect,
            ResultSetMapper<T> mapper
    ) {
        try (Statement statement =
                     connection.createStatement()) {
            ResultSet resultSet =
                    statement.executeQuery(sqlSelect);
            List<T> list = new ArrayList<>();
            while (resultSet.next()) {
                T entity = mapper.map(resultSet);
                list.add(entity);
            }
            return list;
        } catch (SQLException e) {
            throw new RuntimeException("Error while statement executing");
        }
    }
}