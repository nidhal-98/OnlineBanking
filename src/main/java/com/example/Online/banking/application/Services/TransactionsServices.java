package com.example.Online.banking.application.Services;

import com.example.Online.banking.application.Models.Transactions;
import com.example.Online.banking.application.Repositories.TransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionsServices {

    @Autowired
    TransactionsRepository transactionsRepository;

    public List<Transactions> getAllTransactions() {
        return transactionsRepository.findAll();
    }
}
