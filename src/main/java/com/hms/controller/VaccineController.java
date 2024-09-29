package com.hms.controller;


import com.hms.model.User;
import com.hms.model.Vaccine;
import com.hms.service.VaccineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VaccineController {

    @Autowired
    private VaccineService vaccineService;

    @PostMapping("/vaccine")
    public Vaccine saveVaccine(@RequestBody Vaccine vaccine){

        return vaccineService.saveVaccine(vaccine);
    }

    @GetMapping("/vaccine")
    public List<Vaccine> fatchVaccineList(){

        return vaccineService.fatchVaccineList();
    }

    @GetMapping("/vaccine/{id}")
    public Vaccine fatchVaccine(@PathVariable("id") int vaccineId){

        return vaccineService.fatchVaccineById(vaccineId);
    }

    @DeleteMapping(path = "/vaccine/{id}")
    public @ResponseBody String deleteVaccineById(@PathVariable int id){
        vaccineService.deleteVaccineById(id);
        return "Record deleted";
    }

    @PutMapping(path = "vaccine/{id}")
    public @ResponseBody Vaccine updateVaccineById(@PathVariable int id, @RequestBody Vaccine vaccine){
        return vaccineService.updateVaccineById(id, vaccine);
    }
}
