package com.webservices.microservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {

  @GetMapping("/hello-world")
  public String value(){
    return "chukwudi is a very good boy";
  }
  @GetMapping("world-bean")
  public HelloworldBean hello(){
    return new HelloworldBean("omega pasky is a good boy");
  }


}
