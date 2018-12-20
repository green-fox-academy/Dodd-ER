package com.zmesza.reddit.service;

import com.zmesza.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

  PostRepository repository;

  @Autowired
  public PostServiceImpl(PostRepository repository) {
    this.repository = repository;
  }
}
