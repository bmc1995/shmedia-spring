package dev.mccrackin.shmedia.service;

import dev.mccrackin.shmedia.model.Post;

import java.time.LocalDateTime;
import java.util.List;

public interface PostService {
    List<Post> getAllPosts();

    Post updatePost(int id);

    Post getPost(int id);

    Post createPost(int id, String content);

    String deletePost(int id);
}
