package com.mmalkiew.example.esm.account.query;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("com.mmalkiew.example.esm.account")
public class AccountQueryApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountQueryApplication.class, args);
    }

}
