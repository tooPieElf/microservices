package com.webservices.microservices.helloworld;

public class HelloworldBean {

private String message;
  public HelloworldBean(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
