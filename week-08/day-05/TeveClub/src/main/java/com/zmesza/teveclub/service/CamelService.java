package com.zmesza.teveclub.service;

import com.zmesza.teveclub.model.Camel;

import java.util.List;

public interface CamelService {

  void saveCamel(Camel camel);
  void deleteCamelById(long id);
  Camel getCamelById(long id);
  List<Camel> getAllCamel();
  List<Camel> getAllCamelsByUserId(long id);
  String getStringToCamelsByUserId(long id);
}
