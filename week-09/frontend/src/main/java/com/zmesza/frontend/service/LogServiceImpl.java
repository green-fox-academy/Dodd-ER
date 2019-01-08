package com.zmesza.frontend.service;

import com.zmesza.frontend.model.Log;
import com.zmesza.frontend.model.LogsStat;
import com.zmesza.frontend.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service

public class LogServiceImpl implements LogService {

  LogRepository logRepository;

  @Autowired
  public LogServiceImpl(LogRepository logRepository) {
    this.logRepository = logRepository;
  }

  public void saveLogEntries(Log log) {
    this.logRepository.save(log);
  }

  public LogsStat listOfEntries() {
    List<Log> resultList = new ArrayList<>();
    this.logRepository.findAll().forEach(resultList :: add);
    return  new LogsStat(resultList, resultList.size());
  }
}
