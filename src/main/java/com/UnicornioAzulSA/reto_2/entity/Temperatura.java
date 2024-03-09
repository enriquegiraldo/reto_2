package com.UnicornioAzulSA.reto_2.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_temperaturas")
public class Temperatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long teperaturaId;
    private String firstName;
    private Long id;
}
