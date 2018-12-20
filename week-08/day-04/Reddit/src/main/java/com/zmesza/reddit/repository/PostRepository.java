package com.zmesza.reddit.repository;

import com.zmesza.reddit.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {
}
