package com.zmesza.frontend.repository;

import com.zmesza.frontend.model.Log;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface LogRepository extends CrudRepository<Log, Long>{
}
