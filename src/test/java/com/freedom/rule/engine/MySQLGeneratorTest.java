package com.freedom.rule.engine;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import java.util.Collections;
import org.junit.jupiter.api.Test;

public class MySQLGeneratorTest {

  /**
   * 数据源配置
   */
  private static final DataSourceConfig DATA_SOURCE_CONFIG = new DataSourceConfig
      .Builder("jdbc:mysql://127.0.0.1:3306/ruleengine?autoReconnect=true&useUnicode=true&characterEncoding=utf-8",
      "root", "WSX2952fcx!")
      .schema("ruleengine")
      .build();

  public static void main(String[] args) {
    FastAutoGenerator.create(
            "jdbc:mysql://127.0.0.1:3306/ruleengine?autoReconnect=true&useUnicode=true&characterEncoding=utf-8", "root",
            "WSX2952fcx!")
        .globalConfig(builder -> {
          builder.author("tobebetter") // 设置作者
              //.enableSwagger() // 开启 swagger 模式
              .outputDir("E:\\10_git\\rule-engine\\src\\main\\java"); // 指定输出目录
        })
        .packageConfig(builder -> {
          builder.parent("com.freedom.rule.engine") // 设置父包名
              .moduleName("system") // 设置父包模块名
              .pathInfo(Collections.singletonMap(OutputFile.xml, "E:\\10_git\\rule-engine\\src\\main\\resources\\mapper")); // 设置mapperXml生成路径
        })
        .strategyConfig(builder -> {
          builder.addInclude("user_tb") // 设置需要生成的表名
              .addTablePrefix("t_", "c_"); // 设置过滤表前缀
        })
        .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
        .execute();
  }

}
