package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class LikesService {

    @Autowired
    PostService postService;

    public int like(Long id){
        Post post = postService.listAllPosts().get(id.intValue());
        post.setLikes(post.getLikes() + 1);
        return post.getLikes();
    }
}