package com.hms.controller;

import com.hms.model.HealthcareProviders;
import com.hms.model.Vaccine;
import com.hms.service.HealthcareProvidersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    //localhost:5900/healthcareproviders/id
    @GetMapping("/healthcareproviders/{id}")
    public HealthcareProviders fatchHealthcareProviders(@PathVariable ("id") int healthcareProvidersId){
        return healthcareProvidersService.fatchHealthcareProvidersById(healthcareProvidersId);

    }

    //localhost:5900/healthcareproviders/id
    @DeleteMapping("/healthcareproviders/{id}")
    public @ResponseBody String deleteHealthcareProvidersById(@PathVariable int id){

        healthcareProvidersService.deleteHealthcareProvidersById(id);
        return "Healthcare provider deleted";
    }

}
