package com.zmesza.yondu.controller_test;

import com.zmesza.yondu.controller.ArrowController;
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
@WebMvcTest(ArrowController.class)
public class ArrowControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void getSpeedFunction_testCase1() throws Exception {
    this.mockMvc.perform(get("/yondu?distance=100&time=10"))
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(jsonPath("$.speed", is(10.0)));
  }

  @Test
  public void getSpeedFunction_testCase2() throws Exception {
    this.mockMvc.perform(get("/yondu?distance=100&time=0"))
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(jsonPath("$.speed", is("Infinity")));
  }

  @Test
  public void getSpeedFunction_testCase3() throws Exception {
    this.mockMvc.perform(get("/yondu?distance=100&time="))
        .andExpect(MockMvcResultMatchers.status().isBadRequest())
        .andExpect(jsonPath("$.error", is("Provide Distance AND time!")));
  }
}
