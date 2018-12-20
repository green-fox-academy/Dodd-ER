package com.zmesza.reddit.service;

import com.zmesza.reddit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  UserRepository repository;

  @Autowired
  public UserServiceImpl(UserRepository repository) {
    this.repository = repository;
  }
}
