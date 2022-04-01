package com.noma.ecarforfuture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class EcarForFutureApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcarForFutureApplication.class, args);
    }
}
