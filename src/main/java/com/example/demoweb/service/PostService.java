package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class PostService {
    public ArrayList<Post> listAllPosts(){
        return new ArrayList<Post> (Arrays.asList(new Post("Ольгу Бузову повесили на сцене", 5000000),
                new Post("Дима Билан до сих пор жив", 25000),
                new Post("Куда пропал Рома Жёлудь?", 3000)));
    }
}
