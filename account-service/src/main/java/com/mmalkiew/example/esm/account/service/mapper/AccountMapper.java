package com.mmalkiew.example.esm.account.service.mapper;

import com.mmalkiew.example.esm.account.service.dto.AccountDto;
import com.mmalkiew.example.esm.account.service.rest.AccountRest;

public interface AccountMapper {

    AccountRest mapToRest(AccountDto dto);
}
