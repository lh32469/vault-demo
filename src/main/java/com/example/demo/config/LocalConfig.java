package com.example.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
// prefix cannot be empty
@ConfigurationProperties(prefix = "local")
public class LocalConfig {

  private RedisConfig redis;

}
