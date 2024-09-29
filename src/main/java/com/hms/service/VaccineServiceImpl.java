package com.hms.service;

import com.hms.model.Vaccine;
import com.hms.repository.VaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class VaccineServiceImpl implements VaccineService{


    @Autowired
    private VaccineRepo vaccineRepo;

    @Override
    public Vaccine saveVaccine(Vaccine vaccine) {
        return vaccineRepo.save(vaccine);
    }

    @Override
    public List<Vaccine> fatchVaccineList() {
        return vaccineRepo.findAll();
    }

    @Override
    public Vaccine fatchVaccineById(int vaccineId) {
        return vaccineRepo.findById(vaccineId).get();
    }

    @Override
    public void deleteVaccineById(int id) {
        vaccineRepo.deleteById(id);
    }

    
}
