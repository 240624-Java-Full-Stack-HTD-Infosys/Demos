package com.revature.inheritance.persistence;

public interface Dao {
    void create(String str);
    String read();
    void update(String str);
    void delete();

}
