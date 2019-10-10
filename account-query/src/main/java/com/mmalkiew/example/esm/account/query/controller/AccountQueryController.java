package com.mmalkiew.example.esm.account.query.controller;

import com.mmalkiew.example.esm.account.query.service.AccountQueryService;
import com.mmalkiew.example.esm.account.dto.AccountDto;
import com.mmalkiew.example.esm.account.mapper.AccountMapper;
import com.mmalkiew.example.esm.account.rest.AccountRest;
import org.axonframework.config.ProcessingGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ProcessingGroup("accounts")
@RequestMapping("/accounts")
public class AccountQueryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountQueryController.class);

    private final AccountQueryService service;
    private final AccountMapper mapper;

    public AccountQueryController(AccountQueryService service, AccountMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping("/{id}/details")
    public AccountRest getAccountDetails(@PathVariable("id") String id) {
        LOGGER.info("Account[{}] - get account details invoked", id);
        AccountDto accountDto = service.getAccountById(id);
        return mapper.mapToRest(accountDto);
    }
}
