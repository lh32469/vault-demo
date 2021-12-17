package com.example.demo;

import com.example.demo.config.LocalConfig;
import com.example.demo.config.VaultConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@Slf4j
@SpringBootApplication
@EnableConfigurationProperties({VaultConfig.class, LocalConfig.class})
public class DemoApplication {

  public static void main(String[] args) {
    log.info("DemoApplication.main");
    SpringApplication.run(DemoApplication.class, args);
  }

}
