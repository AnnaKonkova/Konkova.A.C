package ru.vsuet.hospital.integration.inmemory;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface ResultSetMapper <R>{
    R map(ResultSet resultSet) throws SQLException;
}
