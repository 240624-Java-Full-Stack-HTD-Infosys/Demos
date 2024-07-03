package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
Factory Design Pattern
 */
public class ConnectionFactory {
    public static Connection getConnection(String url, String username, String password) throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }
}
