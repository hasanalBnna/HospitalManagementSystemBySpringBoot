package com.hms.repository;

import com.hms.model.HealthcareProviders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HealthcareProvidersRepo extends JpaRepository<HealthcareProviders, Integer> {
}
