package com.example.entity;

import lombok.Data;

@Data
public class User {
  private Integer id;
  private  String realname;
  private  String name;
  private String password;
}