package com.mmalkiew.example.esm.account.query.mapper;

import com.mmalkiew.example.esm.account.dto.AccountDto;
import com.mmalkiew.example.esm.account.rest.AccountRest;

public interface AccountQueryMapper {

    AccountRest mapToRest(AccountDto dto);
}
