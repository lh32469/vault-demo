package com.example.demo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/*
Corresponding Vault data format at these paths:

   jenkins/vault-demo
   jenkins/vault-demo/staging

{
  "cfg.list": [
    "one",
    "two"
  ],
  "cfg.password": "cloudpassword",
  "cfg.timeslot": {
    "duration": 30,
    "start": "09:27:39.389521",
    "userId": "lth"
  },
  "cfg.username": "clouduser"
}

 */

@Data
// prefix cannot be empty
@ConfigurationProperties(prefix = "cfg")
public class VaultConfig {

  private String username;
  private String password;
  private TimeSlot timeslot;
  private List<String> list;

  @Data
  public static class TimeSlot {

    int duration;
    String start;
    String userId;

  }

}