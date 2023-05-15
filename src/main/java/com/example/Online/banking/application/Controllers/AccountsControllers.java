package com.example.Online.banking.application.Controllers;

import com.example.Online.banking.application.Models.Accounts;
import com.example.Online.banking.application.Services.AccountsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Accounts")
public class AccountsControllers {
    @Autowired
    AccountsServices accountsServices;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Accounts> getAllAccounts() {
        return accountsServices.getAllAccounts();
    }
}
