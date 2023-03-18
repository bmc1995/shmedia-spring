package dev.mccrackin.shmedia.controller;

import dev.mccrackin.shmedia.model.Post;
import dev.mccrackin.shmedia.service.PostService;
import dev.mccrackin.shmedia.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
    PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    private List<Post> listPosts() {
        return postService.getAllPosts();
    }

    @GetMapping("/{id}")
    private Post getPost(@PathVariable int id) {
        return postService.getPost(id);
    }

    @PatchMapping("/{id}")
    private Post updatePost(@PathVariable int id) {
        return postService.updatePost(id);
    }

    @PostMapping
    private Post createPost(@RequestBody int id, @RequestBody String content) {
        return postService.createPost(id, content);
    }

    @DeleteMapping("/{id}")
    private String softDeletePost(@PathVariable int id) {
        return postService.deletePost(id);
    }
}
