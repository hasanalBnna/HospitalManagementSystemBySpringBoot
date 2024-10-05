package com.hms.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class RootController {

    @GetMapping(value="/")
    public String rootMap(){

        return "Hello Checker, This is Banna. U here for check Vaccine module.
            /users --->for get user info
/users/add --->for add data to user
/users/update --->for update data to user
/users/delete --->for delete data to user

/vaccine --->for get vaccine info
/vaccine/add --->for add data to vaccine
/vaccine/update --->for update data to vaccine
/vaccine/delete --->for delete data to vaccine

/vaccinationRecords --->for get vaccinationRecords info
/vaccinationRecords/add --->for add data to vaccinationRecords
/vaccinationRecords/update --->for update data to vaccinationRecords
/vaccinationRecords/delete --->for delete data to vaccinationRecords";
    }

    @RequestMapping(value="/test", method= RequestMethod.GET)
    public String testURL(){

        return "Hello testURL!";
    }
}
