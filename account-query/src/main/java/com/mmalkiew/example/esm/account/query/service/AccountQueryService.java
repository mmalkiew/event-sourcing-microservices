package com.mmalkiew.example.esm.account.query.service;

import com.mmalkiew.example.esm.account.service.dto.AccountDto;

public interface AccountQueryService {

    AccountDto getAccountById(String accountId);
}
