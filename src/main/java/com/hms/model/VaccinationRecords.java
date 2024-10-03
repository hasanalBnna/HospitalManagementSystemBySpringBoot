package com.hms.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class VaccinationRecords {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Date dateVaccinated;
    private Date nextDoseDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "vaccine_id")
    private Vaccine vaccine;
}
