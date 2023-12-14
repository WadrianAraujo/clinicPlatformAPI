package br.com.waxsolutions.clinicPlatformAPI.controller;


import br.com.waxsolutions.clinicPlatformAPI.doctor.DataPatientRegister;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @PostMapping
    public void register(@RequestBody DataPatientRegister data){
        System.out.println(data);
    }

}
