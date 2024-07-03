package com.revature;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

/*
The DAO design pattern is a pattern where our object, a DAO (Data Access Object) contains the CRUD functionality
and is tightly coupled to a particular database implementation

Here in Java with JDBC, this means the class that has the SQL code written inside. Each object we would persist in our
database gets its own DAO, so DAOs are tightly coupled to the Models we would persist
 */
public class DemoDao{
    private final Connection connection;

    public DemoDao(Connection connection) {
        this.connection = connection;
    }

    public void create(DemoModel model) throws SQLException {
        String sql = "INSERT INTO demo (message) VALUES (?)";
//        Statement stmt = connection.createStatement();//this SQL statement is hard coded and final
        PreparedStatement pstmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);//This one can be "parameterized"
        pstmt.setString(1, model.getMessage());

        pstmt.executeUpdate();
        ResultSet keys = pstmt.getGeneratedKeys();

        if(keys.next()) {
            model.setId(keys.getInt(1));
        }
    }

    public void update(DemoModel model) throws SQLException {
        String sql = "UPDATE demo SET message = ? WHERE id = ?";
//        Statement stmt = connection.createStatement();//this SQL statement is hard coded and final
        PreparedStatement pstmt = connection.prepareStatement(sql);//This one can be "parameterized"
        pstmt.setString(1, model.getMessage());
        pstmt.setInt(2, model.getId());

        pstmt.executeUpdate();
    }

    public DemoModel read(int id) throws SQLException {
        String sql = "SELECT * FROM demo WHERE id = ?";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setInt(1, id);
        ResultSet results = pstmt.executeQuery();


        DemoModel model = new DemoModel();
        if(results.next()) {
            model.setId(results.getInt("id"));
            model.setMessage(results.getString("message"));
        }

        return model;
    }

    public void delete(DemoModel model) throws SQLException {
        String sql = "DELETE FROM demo WHERE id = ?";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setInt(1, model.getId());

        pstmt.execute();

    }

    public Set<DemoModel> readAll() throws SQLException {
        String sql = "SELECT * FROM demo";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        ResultSet results = pstmt.executeQuery();

        Set<DemoModel> modelSet = new HashSet<DemoModel>();

        while(results.next()) {
            modelSet.add(new DemoModel(results.getInt("id"), results.getString("message")));
        }

        return modelSet;
    }

}
