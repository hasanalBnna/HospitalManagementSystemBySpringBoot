package com.hms.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

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

    @OneToMany(mappedBy = "vaccine", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<VaccinationRecords> vaccinationRecords;
}
