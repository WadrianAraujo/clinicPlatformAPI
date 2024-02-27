package br.com.waxsolutions.clinicPlatformAPI.controller;


import br.com.waxsolutions.clinicPlatformAPI.patient.DTOListPatient;
import br.com.waxsolutions.clinicPlatformAPI.patient.DTOPatientRegister;
import br.com.waxsolutions.clinicPlatformAPI.patient.Patient;
import br.com.waxsolutions.clinicPlatformAPI.patient.PatientRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientRepository repository;

    @PostMapping
    public void register(@RequestBody @Valid DTOPatientRegister data){
        repository.save(new Patient(data));
        System.out.println(data);
    }

    @GetMapping
    public List<DTOListPatient> listPatient(){
        return repository.findAll().stream().map(DTOListPatient::new).toList();
    }

}
