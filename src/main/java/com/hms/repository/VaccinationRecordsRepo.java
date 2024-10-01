package com.hms.repository;

import com.hms.model.User;
import com.hms.model.VaccinationRecords;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccinationRecordsRepo extends JpaRepository<VaccinationRecords, Integer> {
}
