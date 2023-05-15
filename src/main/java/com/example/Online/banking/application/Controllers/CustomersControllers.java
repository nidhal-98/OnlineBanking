package com.example.Online.banking.application.Controllers;


import com.example.Online.banking.application.Models.Customers;
import com.example.Online.banking.application.Services.CustomersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Doctors")
public class CustomersControllers {

    @Autowired
    CustomersServices customersServices;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Customers> getAllCustomers(){
        return customersServices.getAllCustomers();
    }
}
