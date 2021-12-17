package com.example.demo;

import com.example.demo.config.LocalConfig;
import com.example.demo.config.VaultConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class DemoRestController {

  private final VaultConfig vaultConfig;
  private final LocalConfig localConfig;

  public DemoRestController(VaultConfig config, LocalConfig localConfig) {
    this.vaultConfig = config;
    this.localConfig = localConfig;
  }

  @GetMapping("/")
  public String homePage() {
    return vaultConfig + "\n" + localConfig + "\n";
  }

}
