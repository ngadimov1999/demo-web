package com.example.demoweb.model;

import java.sql.Date;

public class Post {
    private String text;
    private Integer likes;
    private Date creationDate;

    public Post(String text, Integer likes){
        this.text = text;
        this.likes = likes;
        this.creationDate = creationDate;
    }

    public String getText(){
        return this.text;
    }
    public Integer getLikes(){
        return this.likes;
    }
    public Date getCreationDate(){return this.creationDate;}
}