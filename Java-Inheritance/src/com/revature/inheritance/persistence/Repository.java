package com.revature.inheritance.persistence;

public class Repository {
    Dao dao;

    public Repository(Dao dao) {
        this.dao = dao;
    }

    public void create(String str) {
        this.dao.create(str);
    }

    public String read() {
        return this.dao.read();
    }


    public void update(String str) {
        this.dao.update(str);
    }

    public void delete() {
        this.dao.delete();
    }


}
