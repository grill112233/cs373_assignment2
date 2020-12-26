package com.cs373.assignment2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.cs373.assignment2.service.checkLoginService;
import com.cs373.assignment2.service.checkLoginServiceController;

@WebMvcTest(checkLoginServiceController.class)
public class BasicTest {


	  @Autowired
	  private MockMvc mvc;

	  @MockBean
	  checkLoginService loginServiceMock;

	  @Test
	  public void testHomePage() throws Exception {
	    mvc.perform(
	    MockMvcRequestBuilders.get("/login")
	   .accept(MediaType.APPLICATION_JSON))
	   .andExpect(MockMvcResultMatchers.status().isOk());
	  }
	  
	  @Test
	  public void testCheckLoginExist() throws Exception {
		mvc.perform(
		MockMvcRequestBuilders.post("/checkLogin")
		.param("username", "exist")
        .param("password", "exist")
        .accept(MediaType.APPLICATION_JSON))
		.andExpect(MockMvcResultMatchers.status().isOk());
	  }

}
