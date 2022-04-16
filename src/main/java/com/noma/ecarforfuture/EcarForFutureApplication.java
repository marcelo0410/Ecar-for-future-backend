package com.noma.ecarforfuture;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.noma.ecarforfuture.mapper")
@ComponentScan(basePackages = "com.noma")
public class EcarForFutureApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcarForFutureApplication.class, args);
    }
}
