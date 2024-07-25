package com.revature.socialmediaprototype.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity(name="posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer postId;

    @Column
    private String title;

    @Column
    private String body;

    @OneToMany(mappedBy = "parentPost")
    @JsonManagedReference
    private List<Comment> comments;

    @ManyToOne
    @JsonBackReference
    @JoinColumn
    private User author;

    @ManyToMany
    @JsonBackReference
    @JoinTable
    private List<User> usersWhoLikeThisPost;

    public Post(Integer postId, String title, String body, List<Comment> comments, User author, List<User> usersWhoLikeThisPost) {
        this.postId = postId;
        this.title = title;
        this.body = body;
        this.comments = comments;
        this.author = author;
        this.usersWhoLikeThisPost = usersWhoLikeThisPost;
    }

    public Post(String title, String body, List<Comment> comments, User author, List<User> usersWhoLikeThisPost) {
        this.title = title;
        this.body = body;
        this.comments = comments;
        this.author = author;
        this.usersWhoLikeThisPost = usersWhoLikeThisPost;
    }

    public Post() {
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public List<User> getUsersWhoLikeThisPost() {
        return usersWhoLikeThisPost;
    }

    public void setUsersWhoLikeThisPost(List<User> usersWhoLikeThisPost) {
        this.usersWhoLikeThisPost = usersWhoLikeThisPost;
    }
}
