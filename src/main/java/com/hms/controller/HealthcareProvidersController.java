package com.hms.controller;

import com.hms.model.HealthcareProviders;
import com.hms.model.Vaccine;
import com.hms.service.HealthcareProvidersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthcareProvidersController {

    @Autowired
    private HealthcareProvidersService healthcareProvidersService;

    @PostMapping("/healthcareproviders")
    public HealthcareProviders saveHealthcareProviders(@RequestBody HealthcareProviders healthcareProviders){

        return healthcareProvidersService.saveHealthcareProviders(healthcareProviders);
    }

}
