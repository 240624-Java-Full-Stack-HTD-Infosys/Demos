package com.revature.inheritance.persistence;

public class Driver {
    public static void main(String[] args) {
        Dao myDao = new PgDao();
        Repository repo = new Repository(myDao);

        repo.create("This is the string");
    }
}
