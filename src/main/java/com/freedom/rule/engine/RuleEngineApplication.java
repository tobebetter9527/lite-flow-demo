package com.freedom.rule.engine;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.freedom.rule.engine.*.mapper")
@SpringBootApplication
public class RuleEngineApplication {

  public static void main(String[] args) {
    SpringApplication.run(RuleEngineApplication.class, args);
  }

}
