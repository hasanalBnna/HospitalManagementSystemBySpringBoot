package com.hms.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int mid;
    private String username;
    private String password;
    private String fullName;
    private String phone;
    private int age;
    private char sex;
    private String address;
    private String userType;


    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<VaccinationRecords> vaccinationRecords;


}
