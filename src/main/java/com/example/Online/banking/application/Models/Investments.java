package com.example.Online.banking.application.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "Investments")
public class Investments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    Integer customerId;
    String InvestmentType;
    Long InvestmentAmount;
}
