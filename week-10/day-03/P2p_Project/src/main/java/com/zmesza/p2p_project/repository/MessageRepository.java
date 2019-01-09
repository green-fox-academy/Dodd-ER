package com.zmesza.p2p_project.repository;

import com.zmesza.p2p_project.model.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends CrudRepository<Message, Long> {
  List<Message> findAll();
}
