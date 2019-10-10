package com.mmalkiew.example.esm.account.mapper;

import com.mmalkiew.example.esm.account.dto.AccountDto;
import com.mmalkiew.example.esm.account.rest.AccountRest;
import org.springframework.stereotype.Component;

@Component
public class AccountMapperImpl implements AccountMapper {

    @Override
    public AccountRest mapToRest(AccountDto dto) {
        return null;
    }
}
