package com.revature;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class Driver {
    public static void main(String[] args) throws IOException, SQLException {
        InputStream inputStream = Driver.class.getClassLoader().getResourceAsStream("application.properties");
        Properties props = new Properties();
        props.load(inputStream);

        Connection conn = ConnectionFactory.getConnection(props.getProperty("url"), props.getProperty("username"), props.getProperty("password"));
        DemoDao demoDao = new DemoDao(conn);


        DemoModel model = new DemoModel("Hello, world!");
        demoDao.create(model);

        System.out.println("new row added: " + model.getId());


        model.setMessage("Goodbye, world!");
        demoDao.update(model);

        //demoDao.delete(model);

        for(DemoModel temp : demoDao.readAll()) {
            System.out.println(temp);
        }


    }
}
