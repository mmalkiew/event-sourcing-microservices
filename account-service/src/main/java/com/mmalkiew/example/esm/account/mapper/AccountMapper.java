package com.mmalkiew.example.esm.account.mapper;

import com.mmalkiew.example.esm.account.dto.AccountDto;
import com.mmalkiew.example.esm.account.model.Account;

public interface AccountMapper {

    AccountDto mapToDto(Account account);
}
