package com.webservices.microservices.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
  private static List<User> users = new ArrayList<>();
  private static int userCount = 3;
  static {
    users.add(new User("Chukwudi", 1, new Date()));
    users.add(new User("Obioma", 2, new Date()));
    users.add(new User("Ebuka", 3, new Date()));

  }
  public List<User> findAll(){
    return users;
  }

  public User save(User user){
    if(user.getId()==0){
      user.setId(++userCount);
    }
    users.add(user);
    return user;
  }

  public User findOne(int id){
    for (User user: users) {
      if(user.getId()==id){
        return user;
      }
    }
    return null;
  }


}

