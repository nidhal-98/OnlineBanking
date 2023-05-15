package com.example.Online.banking.application.Services;

import com.example.Online.banking.application.Models.Customers;
import com.example.Online.banking.application.Repositories.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomersServices {

    @Autowired
    CustomersRepository customersRepository;

    public List<Customers> getAllCustomers() {
        return customersRepository.findAll();
    }
}
