package com.revature.springdatademo.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column
    private String username;

    @Column
    private String password;

    /*
    This is the "non-owner" side of this multiplicity. See the "user" field of Tasks for the other side.
    Here we just need to specify that there is a multiplicity, but this is not the owning side. This multiplicity
    is "mapped by" the foreign key which will not appear in this entity's table. We would say this
    One-to-Many multiplicity is mapped by the "user" field in the other entity.
    Just to be extra confusing, we map by the name of the Java field, not the name of the foreign key column.
     */
    @OneToMany(mappedBy = "user") //the name of the field in the other entity
    Set<Task> tasks;




    public User(Integer userId, String firstName, String lastName, String username, String password) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }

    public User(String firstName, String lastName, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }

    public User() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /*
    In this toString we do show the tasks associated. We just need to make sure we don't also
    show the user value, as we would then have a circular reference. If we did that and ever called
    toString on either, we would be in an infinite loop.

    I chose to have the User side showing the Tasks because of the one-to-many relation. When displayed
    a user would show all their tasks, but the tasks won't then also show the user.
     */
    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", tasks=" + tasks +
                '}';
    }
}
