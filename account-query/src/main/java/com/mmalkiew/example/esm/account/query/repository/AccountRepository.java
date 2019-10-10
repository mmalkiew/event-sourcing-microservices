package com.mmalkiew.example.esm.account.query.repository;

import com.mmalkiew.example.esm.account.model.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends MongoRepository<Account, String> {

}
