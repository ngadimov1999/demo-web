package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private String text;
    private Integer likes;
    private Date creationDate;
    private Long id;

    public Post(Long id, String text, Date creationDate){
        this.text = text;
        this.likes = 0;
        this.creationDate = creationDate;
        this.id = id;
    }

    public String getText(){
        return this.text;
    }
    public Integer getLikes(){
        return this.likes;
    }
    public Date getCreationDate(){
        return this.creationDate;
    }
    public void setLikes(int likes) {
        this.likes = likes;
    }
    public Long getId(){
        return this.id;
    }
}