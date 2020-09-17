package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.ArrayList;
import java.util.Arrays;

@Service
public class PostService {

    private ArrayList<Post> posts = new ArrayList<Post>(Arrays.asList(new Post("Ольгу Бузову повесили на сцене", new Date()),
            new Post("Дима Билан до сих пор жив",  new Date()),
            new Post("Куда пропал Рома Жёлудь?",  new Date())));


    public ArrayList<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post(text, new Date()));
    }
}
