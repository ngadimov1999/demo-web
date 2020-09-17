package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.ArrayList;
import java.util.Arrays;

@Service
public class PostService {

    private ArrayList<Post> posts = new ArrayList<Post>(Arrays.asList(new Post(0L,"Ольгу Бузову повесили на сцене", new Date()),
            new Post(1L,"Дима Билан до сих пор жив",  new Date()),
            new Post(2L,"Куда пропал Рома Жёлудь?",  new Date())));


    public ArrayList<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post((long) posts.size(), text, new Date()));
    }
}
