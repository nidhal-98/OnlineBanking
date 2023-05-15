package com.example.Online.banking.application.Controllers;

import com.example.Online.banking.application.Models.Loans;
import com.example.Online.banking.application.Services.LoansServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Loans")
public class LoansControllers {
    @Autowired
    LoansServices loansServices;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Loans> getAllLoans() {
        return loansServices.getAllLoans();
    }
}
