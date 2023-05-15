package com.example.Online.banking.application.Controllers;

import com.example.Online.banking.application.Models.Transactions;
import com.example.Online.banking.application.Services.TransactionsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Transactions")
public class TransactionsControllers {

    @Autowired
    TransactionsServices transactionsServices;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Transactions> getAllTransactions() {
        return transactionsServices.getAllTransactions();
    }
}
