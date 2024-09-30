package com.hms.service;

import com.hms.model.HealthcareProviders;
import com.hms.repository.HealthcareProvidersRepo;
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
}
