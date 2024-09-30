package com.hms.service;

import com.hms.model.HealthcareProviders;

import java.util.List;

public interface HealthcareProvidersService {
    HealthcareProviders saveHealthcareProviders(HealthcareProviders healthcareProviders);


    List<HealthcareProviders> fatchHealthcareProvidersList();

    HealthcareProviders fatchHealthcareProvidersById(int healthcareProvidersId);
}
