package com.hms.service;

import com.hms.model.User;
import com.hms.model.Vaccine;
import com.hms.repository.VaccineRepo;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Objects;

public class VaccineServiceImpl implements VaccineService{


    @Autowired
    private VaccineRepo vaccineRepo;

    @Override
    public Vaccine saveVaccine(Vaccine vaccine) {
        return vaccineRepo.save(vaccine);
    }

    @Override
    public List<Vaccine> fatchVaccineList() {
        return vaccineRepo.findAll();
    }

    @Override
    public Vaccine fatchVaccineById(int vaccineId) {
        return vaccineRepo.findById(vaccineId).get();
    }

    @Override
    public void deleteVaccineById(int id) {
        vaccineRepo.deleteById(id);
    }
//  This is 2nd version where i use @NotNull( inferred annotation)
    @Override
    public @NotNull Vaccine updateVaccineById(@NotNull int id, @NotNull Vaccine vaccine) {
        @NotNull Vaccine vaccineToUpdate = vaccineRepo.findById(id).orElseThrow();

        if ( vaccine.getVname() != null && !"".equalsIgnoreCase(vaccine.getVname())) {
            vaccineToUpdate.setVname(vaccine.getVname());
        } else if ( vaccine.getType() != null && !"".equalsIgnoreCase(vaccine.getType())) {
            vaccineToUpdate.setType(vaccine.getType());
        } else if ( vaccine.getManufacturer() != null && !"".equalsIgnoreCase(vaccine.getManufacturer())) {
            vaccineToUpdate.setManufacturer(vaccine.getManufacturer());
        } else if ( vaccine.getDosage() != null && !"".equalsIgnoreCase(vaccine.getDosage())) {
            vaccineToUpdate.setDosage(vaccine.getDosage());
        }

        return vaccineRepo.save(vaccineToUpdate);
    }
//    This is 1st version where i not use inferred annotation
//    @Override
//    public Vaccine updateVaccineById(int id, Vaccine vaccine) {
//        Vaccine vaccineToUpdate = vaccineRepo.findById(id).get();
//
//        if(Objects.nonNull(vaccine.getVname()) && !"".equalsIgnoreCase(vaccine.getVname())) {
//            vaccineToUpdate.setVname(vaccine.getVname());
//        }
//        else if (Objects.nonNull(vaccine.getType()) && !"".equalsIgnoreCase(vaccine.getType())) {
//            vaccineToUpdate.setType(vaccine.getType());
//
//        } else if (Objects.nonNull(vaccine.getManufacturer()) && !"".equalsIgnoreCase(vaccine.getManufacturer())) {
//            vaccineToUpdate.setManufacturer(vaccine.getManufacturer());
//
//        } else if (Objects.nonNull(vaccine.getDosage()) && !"".equalsIgnoreCase(vaccine.getDosage())) {
//            vaccineToUpdate.setDosage(vaccine.getDosage());
//
//        }
//
//        return vaccineRepo.save(vaccineToUpdate);
//    }


//    this is 3rd version ,where i simplified if-else condition
//    @Override
//    public @NotNull Vaccine updateVaccineById(@NotNull int id, @NotNull Vaccine vaccine) {
//        @NotNull Vaccine vaccineToUpdate = vaccineRepo.findById(id).orElseThrow();
//
//        updateField(vaccineToUpdate, vaccine.getVname(), Vaccine::setVname);
//        updateField(vaccineToUpdate, vaccine.getType(), Vaccine::setType);
//        updateField(vaccineToUpdate, vaccine.getManufacturer(), Vaccine::setManufacturer);
//        updateField(vaccineToUpdate, vaccine.getDosage(), Vaccine::setDosage);
//
//        return vaccineRepo.save(vaccineToUpdate);
//    }
//
//    private void updateField(@NotNull Vaccine vaccineToUpdate, @NotNull String value, Consumer<String> setter) {
//        if (!"".equalsIgnoreCase(value)) {
//            setter.accept(value);
//        }
//    }


}
