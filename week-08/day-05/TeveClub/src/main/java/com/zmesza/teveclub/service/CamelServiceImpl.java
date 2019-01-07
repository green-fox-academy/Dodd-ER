package com.zmesza.teveclub.service;

import com.zmesza.teveclub.model.Camel;
import com.zmesza.teveclub.repository.CamelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CamelServiceImpl implements CamelService {

  private CamelRepository camelRepository;

  @Autowired
  public CamelServiceImpl(CamelRepository camelRepository) {
    this.camelRepository = camelRepository;
  }

  @Override
  public void saveCamel(Camel camel) {
    this.camelRepository.save(camel);
  }

  @Override
  public void deleteCamelById(long id) {
    this.camelRepository.deleteById(id);
  }

  @Override
  public Camel getCamelById(long id) {
    return this.camelRepository.findById(id).orElse(null);
  }

  @Override
  public List<Camel> getAllCamel() {
    List<Camel> listOfCamels = new ArrayList<>();
    this.camelRepository.findAll().forEach(listOfCamels::add);
    return listOfCamels;
  }

  @Override
  public List<Camel> getAllCamelsByUserId(long id) {
    List<Camel> listOfCamels = new ArrayList<>();
    this.camelRepository.findAllByUserIdEquals(id).forEach(listOfCamels::add);
    return listOfCamels;
  }

  @Override
  public String getStringToCamelsByUserId(long id) {
    return "redirect:/camel/{" + id + "}/mycamels";
  }
}
