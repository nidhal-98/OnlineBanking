package com.example.Online.banking.application.Services;

import com.example.Online.banking.application.Models.Loans;
import com.example.Online.banking.application.Repositories.LoansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoansServices {

    @Autowired
    LoansRepository loansRepository;

    public List<Loans> getAllLoans() {
        return loansRepository.findAll();
    }
}
