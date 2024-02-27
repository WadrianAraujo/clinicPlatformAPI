package br.com.waxsolutions.clinicPlatformAPI.controller;


import br.com.waxsolutions.clinicPlatformAPI.patient.*;
import jakarta.transaction.Transactional;
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
    @Transactional
    public void register(@RequestBody @Valid DTOPatientRegister data){
        repository.save(new Patient(data));
        System.out.println(data);
    }

    @GetMapping
    public List<DTOListPatient> listPatient(){
        return repository.findAll().stream().map(DTOListPatient::new).toList();
    }

    @PutMapping
    @Transactional
    public void update(@RequestBody @Valid DTOPatientUpdate data){
        var patient = repository.getReferenceById(data.id());
        patient.updateData(data);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void delete(@PathVariable Long id){
        repository.deleteById(id);

    }
}
