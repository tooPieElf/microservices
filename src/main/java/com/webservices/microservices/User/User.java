package com.webservices.microservices.User;

import java.util.Date;

public class User {

  private int Id;
  private String name;
  private Date birthDate;


  public User() {
  }

  public User(String name, int id, Date birthDate) {
    this.name = name;
    Id = id;
    this.birthDate = birthDate;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return Id;
  }

  public void setId(int id) {
    Id = id;
  }

  public Date getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  @Override
  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        ", Id=" + Id +
        ", birthDate=" + birthDate +
        '}';
  }
}
