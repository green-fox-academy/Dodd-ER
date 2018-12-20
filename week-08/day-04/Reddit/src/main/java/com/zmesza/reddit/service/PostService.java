package com.zmesza.reddit.service;

import com.zmesza.reddit.model.Post;

import java.util.List;

public interface PostService {

  List<Post> getAllPost();
  void saveNewPost(Post post);
  void deletePostById(int id);
  Post getPostById(int id);
  void voteUpById(int id);
  void voteDownById(int id);
}
