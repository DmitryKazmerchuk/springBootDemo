package ru.netology.springbootdemo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

  @ConditionalOnProperty("netology.profile.dev")
  @Bean
  public SystemProfile devProfile() {
    return new DevProfile();
  }

  @ConditionalOnProperty(name = "netology.profile.dev", havingValue="false")
  @Bean
  public SystemProfile prodProfile() {
    return new ProductionProfile();
  }
}
