package com.mmalkiew.example.esm.account.controller;

import com.mmalkiew.example.esm.account.command.CreateAccountCommand;
import com.mmalkiew.example.esm.account.request.CreateAccountRequest;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/accounts")
public class AccountCommandController {

    private final CommandGateway commandGateway;

    public AccountCommandController(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    @PostMapping()
    public CompletableFuture<String> createAccount(@RequestBody CreateAccountRequest request) {
        String id = UUID.randomUUID().toString();
        return commandGateway.send(CreateAccountCommand.builder()
                                                       .withId(id)
                                                       .withName(request.getName())
                                                       .withBalance(request.getBalance())
                                                       .build());
    }
}
