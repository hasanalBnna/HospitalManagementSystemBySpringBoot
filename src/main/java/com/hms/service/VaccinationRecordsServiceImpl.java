package com.hms.service;

import com.hms.model.VaccinationRecords;
import com.hms.model.Vaccine;
import com.hms.repository.UserRepo;
import com.hms.repository.VaccinationRecordsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccinationRecordsServiceImpl implements VaccinationRecordsService{

    @Autowired
    private VaccinationRecordsRepo vaccinationRecordsRepo;

    @Override
    public VaccinationRecords saveVaccinationRecords(VaccinationRecords vaccinationRecords) {
        return vaccinationRecordsRepo.save(vaccinationRecords);
    }

    @Override
    public List<VaccinationRecords> fatchVaccinationRecordsList() {
        return vaccinationRecordsRepo.findAll();
    }

    @Override
    public VaccinationRecords fatchVaccinationRecordsById(int vaccinationRecordsId) {
        return vaccinationRecordsRepo.findById(vaccinationRecordsId).get();
    }

    @Override
    public void deleteVaccinationRecordsById(int id) {
        vaccinationRecordsRepo.deleteById(id);
    }


}
