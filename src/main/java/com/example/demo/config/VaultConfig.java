package com.example.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/*
Corresponding Vault data format at these paths:

   jenkins/vault-demo
   jenkins/vault-demo/staging

{
  "cfg.list": [
    "one",
    "two",
    "three"
  ],
  "cfg.username": "prodUser",
  "cfg.password": "prodPass",
  "cfg.mysql": {
    "host": "jdbc:mysql://mysql:3306/demo?useTimezone=true&serverTimezone=GMT&autoReconnect=true&useSSL=false",
    "user": "root",
    "pass": "mysql"
  },
  "cfg.timeslot": {
    "duration": 30,
    "start": "09:27:39.389521",
    "userId": "lth"
  }
}


 */

@Data
// prefix cannot be empty
@Component
@ConfigurationProperties(prefix = "cfg")
public class VaultConfig {

  private String username;
  private String password;
  private TimeSlot timeslot;
  private List<String> list;
  private MySqlConfig mysql;

  @Data
  public static class TimeSlot {

    int duration;
    String start;
    String userId;

  }

}
