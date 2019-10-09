package com.mmalkiew.example.esm.account.service.mapper;

import com.mmalkiew.example.esm.account.service.dto.AccountDto;
import com.mmalkiew.example.esm.account.service.rest.AccountRest;
import org.springframework.stereotype.Component;

@Component
public class AccountMapperImpl implements AccountMapper {

    @Override
    public AccountRest mapToRest(AccountDto dto) {
        return null;
    }
}
