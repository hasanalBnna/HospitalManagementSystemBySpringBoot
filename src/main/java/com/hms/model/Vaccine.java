package com.hms.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Vaccine {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int vid;
    private String vname;
    private String type;
    private String manufacturer;
    private String dosage;
}
