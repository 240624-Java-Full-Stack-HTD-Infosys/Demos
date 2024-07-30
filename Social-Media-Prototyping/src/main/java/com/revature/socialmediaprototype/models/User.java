package com.revature.socialmediaprototype.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column
    private String username;

    @Column
    private String password;

    @ManyToMany
    @JsonBackReference
    @JoinTable(
            name = "users_followers",
            joinColumns = @JoinColumn(name = "\"user\""),
            inverseJoinColumns = @JoinColumn(name = "following")
    )
    private List<User> following;//this is our user following many other users

    @OneToMany(mappedBy = "author")
    @JsonManagedReference
    private List<Post> posts;

    @OneToMany(mappedBy = "author")
    @JsonManagedReference
    private List<Comment> comments;

    @ManyToMany(mappedBy = "usersWhoLikeThisPost")
    @JsonManagedReference
    private List<Post> likedPosts;

    @ManyToMany(mappedBy = "usersWhoLikeThisComment")
    @JsonManagedReference
    private List<Comment> likedComments;


    public User(Integer userId, String username, String password, List<User> following) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.following = following;
    }

    public User(String username, String password, List<User> following) {
        this.username = username;
        this.password = password;
        this.following = following;
    }

    public User() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public List<User> getFollowing() {
        return following;
    }

    public void setFollowing(List<User> following) {
        this.following = following;
    }
}
