package com.webservices.microservices.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
  private static List<User> users = new ArrayList<>();
  {
    users.add(new User("Chukwudi", 1, new Date()));
    users.add(new User("Obioma", 2, new Date()));
    users.add(new User("Ebuka", 1, new Date()));

  }

}

