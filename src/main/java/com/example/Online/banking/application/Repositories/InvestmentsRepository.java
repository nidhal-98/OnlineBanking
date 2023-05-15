package com.example.Online.banking.application.Repositories;

import com.example.Online.banking.application.Models.Investments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvestmentsRepository extends JpaRepository<Investments, Integer> {
}
