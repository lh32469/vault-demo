package com.example.demo;

import com.example.demo.config.RedisConfig;
import com.example.demo.config.VaultConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@Scope("request")
@RestController
public class DemoRestController {

  private VaultConfig vaultConfig;

  private RedisConfig redisConfig;

  @Autowired
  public void set(VaultConfig vaultConfig) {
    this.vaultConfig = vaultConfig;
  }

  @Autowired
  void set(RedisConfig redisConfig) {
    this.redisConfig = redisConfig;
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

  @GetMapping("/map")
  public String map(@Value("#{${map}}") Map map) {
    return map + "\n";
  }

  @GetMapping("/test")
  public String testKey1(@Value("${test.key1}") String key) {
    return key + "\n";
  }

}
