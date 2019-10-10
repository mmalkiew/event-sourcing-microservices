package com.mmalkiew.example.esm.account.mapper;

import com.mmalkiew.example.esm.account.dto.AccountDto;
import com.mmalkiew.example.esm.account.rest.AccountRest;

public interface AccountMapper {

    AccountRest mapToRest(AccountDto dto);
}
