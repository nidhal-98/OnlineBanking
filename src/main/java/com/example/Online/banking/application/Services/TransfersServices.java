package com.example.Online.banking.application.Services;

import com.example.Online.banking.application.Models.Transfers;
import com.example.Online.banking.application.Repositories.TransfersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransfersServices {

    @Autowired
    TransfersRepository transfersRepository;

    public List<Transfers> getAllTransfers() {
        return transfersRepository.findAll();
    }
}
