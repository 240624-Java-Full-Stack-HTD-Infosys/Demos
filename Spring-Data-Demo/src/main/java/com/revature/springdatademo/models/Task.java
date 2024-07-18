package com.revature.springdatademo.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer taskId;
    private String title;
    private String description;
    private Boolean completed;

    /*
    This is the "owning" side of the multiplicity between users and tasks. This is the entity who's table will contain
    the foreign key field. The JoinColumn name is the name of the column which will represent this multiplicity
    that will be the foreign key column. We are saying: in java memory we reference the other object(s), but in SQL we
    represent this with a foreign key column. This means that this is the "referencing" side, the table where these
    entities get stored will have the FK column and will thus be dependent upon that other table. See the "tasks" field
    in the User entity for the other side of this.
     */
    @ManyToOne
    @JoinColumn(name = "user_id")//the name of the foreign key column that will represent this data in the table
    @JsonBackReference
    private User user;


    public Task(String title, String description, Boolean completed, User user) {
        this.title = title;
        this.description = description;
        this.completed = completed;
        this.user = user;
    }

    public Task(Integer taskId, String title, String description, Boolean completed) {
        this.taskId = taskId;
        this.title = title;
        this.description = description;
        this.completed = completed;
    }

    public Task(String title, String description, Boolean completed) {
        this.title = title;
        this.description = description;
        this.completed = completed;
    }

    public Task() {
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }


    /*
    Note that I have not included the user reference here. That could cause an infinite loop
    if both sides reference each other in the toString method. Even though this side "owns" the
    multiplicity because this entity's table will have the foreign key, I still choose to have the
    user object display the tasks in its toString, and not the other way around.
     */
    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", completed=" + completed +
                '}';
    }
}
