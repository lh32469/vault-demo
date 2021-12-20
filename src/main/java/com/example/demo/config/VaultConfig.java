package com.example.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/*
Corresponding Vault data format at these paths:

   jenkins/vault-demo
   jenkins/vault-demo/staging

See: sample-vault-doc.json

 */

@Data
// prefix cannot be empty
@Component
@ConfigurationProperties(prefix = "cfg")
public class VaultConfig {

  private TimeSlot timeslot;
  private List<String> list;

  @Data
  public static class TimeSlot {

    int duration;
    String start;
    String userId;

  }

}
