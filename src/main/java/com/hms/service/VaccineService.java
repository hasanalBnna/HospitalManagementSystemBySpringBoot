package com.hms.service;

import com.hms.model.Vaccine;

import java.util.List;

public interface VaccineService {
    Vaccine saveVaccine(Vaccine vaccine);

    List<Vaccine> fatchVaccineList();

    Vaccine fatchVaccineById(int vaccineId);

    void deleteVaccineById(int id);

    Vaccine updateVaccineById(int id, Vaccine vaccine);
}
