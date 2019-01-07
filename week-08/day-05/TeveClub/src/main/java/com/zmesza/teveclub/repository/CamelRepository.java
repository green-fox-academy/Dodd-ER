package com.zmesza.teveclub.repository;

import com.zmesza.teveclub.model.Camel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CamelRepository extends CrudRepository<Camel, Long> {

  List<Camel> findAllByUserIdEquals(long id);

}
