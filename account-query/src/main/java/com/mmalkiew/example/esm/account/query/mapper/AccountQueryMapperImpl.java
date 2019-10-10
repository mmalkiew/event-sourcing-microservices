package com.mmalkiew.example.esm.account.query.mapper;

import com.mmalkiew.example.esm.account.dto.AccountDto;
import com.mmalkiew.example.esm.account.rest.AccountRest;
import org.springframework.stereotype.Service;

@Service
public class AccountQueryMapperImpl implements AccountQueryMapper {

    @Override
    public AccountRest mapToRest(AccountDto dto) {
        return null;
    }
}
