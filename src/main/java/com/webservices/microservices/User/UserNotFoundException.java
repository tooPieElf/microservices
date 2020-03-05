package com.webservices.microservices.User;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {

  public UserNotFoundException(String message, Throwable cause) {

  }

  public UserNotFoundException(String message) {

  }
}
