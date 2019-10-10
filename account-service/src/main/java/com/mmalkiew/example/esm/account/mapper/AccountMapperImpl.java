package com.mmalkiew.example.esm.account.mapper;

import com.mmalkiew.example.esm.account.dto.AccountDto;
import com.mmalkiew.example.esm.account.model.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountMapperImpl implements AccountMapper {

    @Override
    public AccountDto mapToDto(Account account) {
        return null;
    }
}
