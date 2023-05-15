package com.example.Online.banking.application.Services;

import com.example.Online.banking.application.Models.Investments;
import com.example.Online.banking.application.Repositories.InvestmentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestmentsServices {

    @Autowired
    InvestmentsRepository investmentsRepository;

    public List<Investments> getAllInvestments() {
        return investmentsRepository.findAll();
    }
}
