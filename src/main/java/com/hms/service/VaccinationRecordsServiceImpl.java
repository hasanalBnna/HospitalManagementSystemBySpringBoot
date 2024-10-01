package com.hms.service;

import com.hms.model.VaccinationRecords;
import com.hms.repository.VaccinationRecordsRepo;
import jakarta.validation.constraints.NotNull;
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

    @Override
    public @NotNull VaccinationRecords updateVaccinationRecordsById(@NotNull int id,@NotNull VaccinationRecords vaccinationRecords) {
        @NotNull  VaccinationRecords vaccinationRecordsToUpdate = vaccinationRecordsRepo.findById(id).orElseThrow();

        if ( vaccinationRecords.getDateVaccinated() != null && !"".equalsIgnoreCase(String.valueOf(vaccinationRecords.getDateVaccinated()))) {
            vaccinationRecordsToUpdate.setDateVaccinated(vaccinationRecords.getDateVaccinated());
        } else if ( vaccinationRecords.getNextDoseDate() != null && !"".equalsIgnoreCase(String.valueOf(vaccinationRecords.getNextDoseDate()))) {
            vaccinationRecordsToUpdate.setNextDoseDate(vaccinationRecords.getNextDoseDate());
        }

        return vaccinationRecordsRepo.save(vaccinationRecordsToUpdate);
    }
    


}
