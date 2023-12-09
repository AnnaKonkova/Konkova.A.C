package org.example.hospital.integration.database;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface ResultSetMapper <R>{
    R map(ResultSet resultSet) throws SQLException;
}
