package com.example.Online.banking.application.Controllers;

import com.example.Online.banking.application.Models.Transfers;
import com.example.Online.banking.application.Services.TransfersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Transfers")
public class TransfersControllers {

    @Autowired
    TransfersServices transfersServices;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Transfers> getAllTransfers() {
        return transfersServices.getAllTransfers();
    }
}
