package com.example.demo.config;

import lombok.Data;
import lombok.ToString;

@Data
public class MySqlConfig {

  private String host;
  private String user;
  @ToString.Exclude
  private String pass;

}
