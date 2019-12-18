package com.mycompany.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kolesar")
public class GameController {

  @GetMapping("/hello-world")
  public String sayHello(String name) {
    return name;
  }

}