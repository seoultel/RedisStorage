package com.example.redisstorage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class RedisStorageApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisStorageApplication.class, args);
    }

}
