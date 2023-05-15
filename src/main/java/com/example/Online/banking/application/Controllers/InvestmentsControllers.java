package com.example.Online.banking.application.Controllers;

import com.example.Online.banking.application.Models.Investments;
import com.example.Online.banking.application.Services.InvestmentsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Investments")
public class InvestmentsControllers {

    @Autowired
    InvestmentsServices investmentsServices;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Investments> getAllInvestments() {
        return investmentsServices.getAllInvestments();
    }
}
