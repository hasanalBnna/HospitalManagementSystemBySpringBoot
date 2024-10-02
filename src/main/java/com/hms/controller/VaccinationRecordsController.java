package com.hms.controller;

import com.hms.model.User;
import com.hms.model.VaccinationRecords;
import com.hms.model.Vaccine;
import com.hms.service.VaccinationRecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VaccinationRecordsController {

    @Autowired
    private VaccinationRecordsService vaccinationRecordsService;

    @PostMapping("/vaccinationRecords/add")
    public VaccinationRecords saveVaccinationRecords(@RequestBody VaccinationRecords vaccinationRecords){

        return vaccinationRecordsService.saveVaccinationRecords(vaccinationRecords);
    }

    @GetMapping("/vaccinationRecords")
    public List<VaccinationRecords> fatchVaccinationRecordsList(){

        return vaccinationRecordsService.fatchVaccinationRecordsList();
    }

    @GetMapping("/vaccinationRecords/{id}")
    public VaccinationRecords fatchVaccinationRecords(@PathVariable("id") int vaccinationRecordsId){

        return vaccinationRecordsService.fatchVaccinationRecordsById(vaccinationRecordsId);
    }

    @DeleteMapping(path = "/vaccinationRecords/delete/{id}")
    public @ResponseBody String deleteVaccinationRecordsById(@PathVariable int id){
        vaccinationRecordsService.deleteVaccinationRecordsById(id);
        return "Record deleted";
    }

    @PutMapping(path = "vaccinationRecords/update/{id}")
    public @ResponseBody VaccinationRecords updateVaccinationRecordsById(@PathVariable int id, @RequestBody VaccinationRecords vaccinationRecords){
        return vaccinationRecordsService.updateVaccinationRecordsById(id, vaccinationRecords);
    }


}
