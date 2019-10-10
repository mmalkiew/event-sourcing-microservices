package com.mmalkiew.example.esm.account.query.service;

import com.mmalkiew.example.esm.account.dto.AccountDto;

public interface AccountQueryService {

    AccountDto getAccountById(String accountId);
}
