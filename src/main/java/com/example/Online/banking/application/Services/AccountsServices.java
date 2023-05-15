package com.example.Online.banking.application.Services;

import com.example.Online.banking.application.Models.Accounts;
import com.example.Online.banking.application.Repositories.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountsServices {

    @Autowired
    AccountsRepository accountsRepository;

    public List<Accounts> getAllAccounts() {
        return accountsRepository.findAll();
    }
}
