package com.hms.service;

import com.hms.model.HealthcareProviders;
import com.hms.model.Vaccine;
import com.hms.repository.HealthcareProvidersRepo;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HealthcareProvidersServiceImpl implements HealthcareProvidersService{
    @Autowired
    private HealthcareProvidersRepo healthcareProvidersRepo;

    @Override
    public HealthcareProviders saveHealthcareProviders(HealthcareProviders healthcareProviders) {
        return healthcareProvidersRepo.save(healthcareProviders);
    }

    @Override
    public List<HealthcareProviders> fatchHealthcareProvidersList() {
        return healthcareProvidersRepo.findAll();
    }

    @Override
    public HealthcareProviders fatchHealthcareProvidersById(int healthcareProvidersId) {
        return healthcareProvidersRepo.findById(healthcareProvidersId).get();
    }

    @Override
    public void deleteHealthcareProvidersById(int id) {
        healthcareProvidersRepo.deleteById(id);
    }

    @Override
    public @NotNull HealthcareProviders updateHealthcareProvidersById(@NotNull int id, @NotNull HealthcareProviders healthcareProviders) {
        @NotNull HealthcareProviders healthcareProvidersToUpdate = healthcareProvidersRepo.findById(id).orElseThrow();

        if ( healthcareProviders.getName() != null && !"".equalsIgnoreCase(healthcareProviders.getName())) {
            healthcareProvidersToUpdate.setName(healthcareProviders.getName());
        } else if ( healthcareProviders.getAddress() != null && !"".equalsIgnoreCase(healthcareProviders.getAddress())) {
            healthcareProvidersToUpdate.setAddress(healthcareProviders.getAddress());
        } else if ( healthcareProviders.getPhone() != null && !"".equalsIgnoreCase(healthcareProviders.getPhone())) {
            healthcareProvidersToUpdate.setPhone(healthcareProviders.getPhone());
        } else if ( healthcareProviders.getLicenseNumber() != null && !"".equalsIgnoreCase(healthcareProviders.getLicenseNumber())) {
            healthcareProvidersToUpdate.setLicenseNumber(healthcareProviders.getLicenseNumber());
        }

        return healthcareProvidersRepo.save(healthcareProvidersToUpdate);
    }
}
