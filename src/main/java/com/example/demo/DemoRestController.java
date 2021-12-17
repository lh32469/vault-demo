package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class DemoRestController {

  private final VaultConfig config;

  public DemoRestController(VaultConfig config) {
    this.config = config;
  }

  @GetMapping("/")
  public String homePage() {
    return config + "\n";
  }

}