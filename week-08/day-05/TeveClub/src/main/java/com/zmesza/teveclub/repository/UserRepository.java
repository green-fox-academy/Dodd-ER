package com.zmesza.teveclub.repository;

import com.zmesza.teveclub.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

  User findByNameAndPassword(String name, String password);
}
