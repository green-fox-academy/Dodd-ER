package com.zmesza.p2p_project.repository;

import com.zmesza.p2p_project.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
  List<User> findAll();
}
