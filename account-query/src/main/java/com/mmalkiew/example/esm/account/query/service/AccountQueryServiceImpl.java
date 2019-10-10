package com.mmalkiew.example.esm.account.query.service;

import com.mmalkiew.example.esm.account.dto.AccountDto;
import com.mmalkiew.example.esm.account.mapper.AccountMapper;
import com.mmalkiew.example.esm.account.query.exception.AccountQueryException;
import com.mmalkiew.example.esm.account.query.repository.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountQueryServiceImpl  implements AccountQueryService {

    private final AccountRepository repository;
    private final AccountMapper mapper;

    public AccountQueryServiceImpl(AccountRepository repository, AccountMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public AccountDto getAccountById(String accountId) {
        return repository.findById(accountId)
                         .map(mapper::mapToDto)
                         .orElseThrow(() -> new AccountQueryException("Account not found"));
    }
}
