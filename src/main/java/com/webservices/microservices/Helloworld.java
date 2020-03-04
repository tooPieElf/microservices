package com.webservices.microservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

  @GetMapping("/world-bean/{chukwudi}")
  public HelloworldBean helloPath(@PathVariable String chukwudi){
    return new HelloworldBean(String.format("he is a good boy %s", chukwudi));
  }

}
