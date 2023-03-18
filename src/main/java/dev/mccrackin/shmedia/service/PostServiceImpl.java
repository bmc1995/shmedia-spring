package dev.mccrackin.shmedia.service;

import dev.mccrackin.shmedia.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {


    public List<Post> getAllPosts() {
        ArrayList<Post> postArrayList = new ArrayList<>();
        postArrayList.add(new Post(1,"Post one of postArrayList"));
        postArrayList.add(new Post(2,"Post two of postArrayList"));
        postArrayList.add(new Post(3,"Post three of postArrayList"));
        postArrayList.add(new Post(4,"Post four of postArrayList"));

        return postArrayList;
    }


    public Post updatePost(int id) {
        return new Post(123, "This is a test of the #updatePost service method");
    }


    public Post getPost(int id) {
        return new Post(123, "This is a test of the #getPost service method");
    }


    public Post createPost(int id, String content) {
        return new Post(id,content);
    }


    public String deletePost(int id) {
        return String.format("Post deleted (Post id: %s)", id);
    }
}
