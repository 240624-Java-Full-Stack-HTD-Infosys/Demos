package com.revature.debugging;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Driver {
    public static void main(String[] args) throws FileNotFoundException {
        BuggyClass bug = new BuggyClass();
        //bug.causeUncheckedException();

        //bug.causeCheckedException();

        bug.causeUncheckedExceptionAndPassTheBuck();

        //bug.causeOneOfManyExceptions();

        try(//try-with-resources
                Connection conn = DriverManager.getConnection("");
                Connection conn2 = DriverManager.getConnection("");
                Connection conn3 = DriverManager.getConnection("");
                ) {
            bug.causeCustomCheckedException();
        } catch (CustomCheckedException e) {
            e.printStackTrace();
        } catch(SQLException e) {
            e.printStackTrace();
        } finally {
            System.out.println("This always happens.");
        }

    }
}
