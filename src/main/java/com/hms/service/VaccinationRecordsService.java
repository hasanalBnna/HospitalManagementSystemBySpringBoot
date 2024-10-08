package com.hms.service;

import com.hms.model.VaccinationRecords;
import com.hms.model.Vaccine;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public interface VaccinationRecordsService {
    VaccinationRecords saveVaccinationRecords(VaccinationRecords vaccinationRecords);

    List<VaccinationRecords> fatchVaccinationRecordsList();

    VaccinationRecords fatchVaccinationRecordsById(int vaccinationRecordsId);

    void deleteVaccinationRecordsById(int id);

    VaccinationRecords updateVaccinationRecordsById(int id, VaccinationRecords vaccinationRecords);
}
