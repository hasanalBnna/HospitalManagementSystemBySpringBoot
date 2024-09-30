package com.hms.controller;

import com.hms.model.HealthcareProviders;
import com.hms.model.Vaccine;
import com.hms.service.HealthcareProvidersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HealthcareProvidersController {

    @Autowired
    private HealthcareProvidersService healthcareProvidersService;

    //localhost:5900/healthcareproviders
    @PostMapping("/healthcareproviders")
    public HealthcareProviders saveHealthcareProviders(@RequestBody HealthcareProviders healthcareProviders){

        return healthcareProvidersService.saveHealthcareProviders(healthcareProviders);
    }

    //localhost:5900/healthcareproviders
    @GetMapping("/healthcareproviders")
    public List<HealthcareProviders> fatchHealthcareProvidersList(){

        return healthcareProvidersService.fatchHealthcareProvidersList();

    }

}
