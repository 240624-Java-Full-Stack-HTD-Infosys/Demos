package com.revature.debugging;

import java.io.*;
import java.sql.SQLException;
import java.util.InvalidPropertiesFormatException;

public class BuggyClass {
    public void causeUncheckedException() {
        int[] arr = new int[]{0,1,2,3,4};
        int x = arr[9];
    }

    public void causeCheckedException() {
        File file = new File("badFilename.txt");
        try {
            InputStreamReader reader = new InputStreamReader(new FileInputStream(file));
        }catch(FileNotFoundException e) {
            System.out.println("There was a problem...");
            e.printStackTrace();
        }
    }

    public void causeUncheckedExceptionAndPassTheBuck() throws FileNotFoundException{
        File file = new File("badFilename.txt");
        InputStreamReader reader = new InputStreamReader(new FileInputStream(file));

        System.out.println("This never happens");
    }

    public void causeOneOfManyExceptions() {
        int random = (int)(Math.random() * 3);
        System.out.println(random);
        try {

            if (random > 1) {
                throw new SQLException("sql");
            } else if (random < 1) {
                throw new InvalidPropertiesFormatException("props");
            } else {
                throw new Exception("ex");
            }
        } catch(InvalidPropertiesFormatException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch(SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch(Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    public void causeOneOfManyExceptionsAndThrowIt() throws SQLException, InvalidPropertiesFormatException{
        int random = (int)Math.random() * 3;
        System.out.println(random);

        if (random > 2) {
            throw new SQLException("sql");
        } else if (random < 1) {
            throw new InvalidPropertiesFormatException("props");
        }

    }



    public void causeNumberFormatException() {
        Integer.parseInt("eleven");
    }

    public void causeCustomCheckedException() throws CustomCheckedException {
        throw new CustomCheckedException("This is our custom checked exception!");
    }




}
