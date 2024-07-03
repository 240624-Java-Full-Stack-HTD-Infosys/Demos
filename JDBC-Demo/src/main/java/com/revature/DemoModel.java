package com.revature;

public class DemoModel {
    private Integer id;
    private String message;

    public DemoModel(int id, String message) {
        this.id = id;
        this.message = message;
    }

    public DemoModel(String message) {
        this.message = message;
    }

    public DemoModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "DemoModel{" +
                "id=" + id +
                ", message='" + message + '\'' +
                '}';
    }
}
