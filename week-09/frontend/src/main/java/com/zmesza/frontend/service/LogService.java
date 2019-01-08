package com.zmesza.frontend.service;

import com.zmesza.frontend.model.Log;
import com.zmesza.frontend.model.LogsStat;

public interface LogService {

  void saveLogEntries(Log log);
  LogsStat listOfEntries();
}
