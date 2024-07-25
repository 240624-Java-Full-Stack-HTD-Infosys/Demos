package com.revature.socialmediaprototype.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.List;

@Entity(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer commentId;

    @Column
    private String body;

    @ManyToOne
    @JoinColumn
    Post parentPost;

    @ManyToOne
    @JsonBackReference
    @JoinColumn
    private User author;

    @ManyToMany
    @JsonBackReference
    @JoinTable
    private List<User> usersWhoLikeThisComment;

    public Comment(Integer commentId, String body, Post parentPost, User author, List<User> usersWhoLikeThisComment) {
        this.commentId = commentId;
        this.body = body;
        this.parentPost = parentPost;
        this.author = author;
        this.usersWhoLikeThisComment = usersWhoLikeThisComment;
    }

    public Comment(String body, Post parentPost, User author, List<User> usersWhoLikeThisComment) {
        this.body = body;
        this.parentPost = parentPost;
        this.author = author;
        this.usersWhoLikeThisComment = usersWhoLikeThisComment;
    }

    public Comment() {
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Post getParentPost() {
        return parentPost;
    }

    public void setParentPost(Post parentPost) {
        this.parentPost = parentPost;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public List<User> getUsersWhoLikeThisComment() {
        return usersWhoLikeThisComment;
    }

    public void setUsersWhoLikeThisComment(List<User> usersWhoLikeThisComment) {
        this.usersWhoLikeThisComment = usersWhoLikeThisComment;
    }
}
