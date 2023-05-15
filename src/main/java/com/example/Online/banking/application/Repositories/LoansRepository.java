package com.example.Online.banking.application.Repositories;

import com.example.Online.banking.application.Models.Loans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoansRepository extends JpaRepository<Loans, Integer> {
}
