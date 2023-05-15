package com.example.Online.banking.application.Repositories;

import com.example.Online.banking.application.Models.Transfers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransfersRepository extends JpaRepository<Transfers, Integer> {
}
