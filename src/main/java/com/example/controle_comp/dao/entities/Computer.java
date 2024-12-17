package com.example.controle_comp.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Computer {
    @Id
    @GeneratedValue
    Long id_Pc;
    String proce;
    String ram;
    String hardDrive;
    double price;
    String macAddress;
}
