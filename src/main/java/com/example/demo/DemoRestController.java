package com.example.demo;

import com.example.demo.config.RedisConfig;
import com.example.demo.config.VaultConfig;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class DemoRestController {

  private final VaultConfig vaultConfig;

  @Autowired
  RedisConfig redisConfig;

  public DemoRestController(VaultConfig config) {
    this.vaultConfig = config;
  }

  @GetMapping("/")
  public String homePage() {
    return vaultConfig + "\n";
  }

  /**
   * Return spring.datasource.username for simple property demo purposes
   */
  @GetMapping("/ds")
  public String datasource(
      @Value("${spring.datasource.username}") String user) {

    log.info("user = {}", user);
    return user + "\n";
  }

  @GetMapping("/redis")
  public String redis() {
    return redisConfig + "\n";
  }

}
