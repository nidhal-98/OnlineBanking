package com.example.Online.banking.application.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Data
@Entity
@Table(name = "Transfers")
public class Transfers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    Long fromAccountNumber;
    Long toAccountNumber;
    Date transferDate;
}
