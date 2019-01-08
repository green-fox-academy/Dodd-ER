package com.zmesza.groot.controllertest;

import com.zmesza.groot.controller.GuardianController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.hamcrest.Matchers.is;


@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class GuardianControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void methodName_testCase1() throws Exception{
    this.mockMvc.perform(get("/groot?message=somemessage"))
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(jsonPath("$.translated", is("I'm Groot!")));
  }

  @Test
  public void methodName_testCase2() throws Exception{
    this.mockMvc.perform(get("/groot?message="))
        .andExpect(MockMvcResultMatchers.status().isBadRequest())
        .andExpect(jsonPath("$.error", is("I'm Groot!")));
  }
}
