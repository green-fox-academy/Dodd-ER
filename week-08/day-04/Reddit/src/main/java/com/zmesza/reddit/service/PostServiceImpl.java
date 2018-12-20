package com.zmesza.reddit.service;

import com.zmesza.reddit.model.Post;
import com.zmesza.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {

  private PostRepository repository;

  @Autowired
  public PostServiceImpl(PostRepository repository) {
    this.repository = repository;
  }

  @Override
  public List<Post> getAllPost() {
    List<Post> originalListOfPosts = new ArrayList<>();
    this.repository.findAll().forEach(originalListOfPosts::add);
    return originalListOfPosts;
  }

  @Override
  public void saveNewPost(Post post) {
    this.repository.save(post);
  }

  @Override
  public void deletePostById(int id) {

  }

  @Override
  public Post getPostById(int id) {
    return null;
  }

  @Override
  public void voteUpById(int id) {

  }

  @Override
  public void voteDownById(int id) {

  }
}
