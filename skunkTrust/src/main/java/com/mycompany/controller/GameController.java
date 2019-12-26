package com.mycompany.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/skunktrust")
public class GameController {

  @PostMapping("/gameController")
  public String takeInput(String input) {
	System.out.println(input);
    return "Hello front-end!";
  }

  //post request here is what was sent from terminal
  
}