package com.cs373.assignment2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class checkLoginServiceController {
	
   @Autowired
   checkLoginService checkLoginService;
   
	@GetMapping("/login")
	public String login() {
		return "index";
	}
	
   @RequestMapping(value = "/checkLogin", method = RequestMethod.POST)
   public ResponseEntity<Object> checkLogin(@RequestParam("username") String username, @RequestParam("password") String password) {
      return new ResponseEntity<>(checkLoginService.checkLogin(username, password), HttpStatus.OK);
   }
   

}