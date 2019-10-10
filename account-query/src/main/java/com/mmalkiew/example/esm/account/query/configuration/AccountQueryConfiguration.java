package com.mmalkiew.example.esm.account.query.configuration;

import org.axonframework.springboot.autoconfig.AxonAutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Configuration;

@Configuration
@AutoConfigureAfter(AxonAutoConfiguration.class)
public class AccountQueryConfiguration {

}
