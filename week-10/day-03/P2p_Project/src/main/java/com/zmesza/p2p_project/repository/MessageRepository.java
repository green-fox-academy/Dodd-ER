package com.zmesza.p2p_project.repository;

import com.zmesza.p2p_project.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Long> {
}
