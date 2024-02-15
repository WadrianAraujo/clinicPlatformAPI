package br.com.waxsolutions.clinicPlatformAPI.controller;

import br.com.waxsolutions.clinicPlatformAPI.doctor.DataDoctorRegister;
import br.com.waxsolutions.clinicPlatformAPI.doctor.Doctor;
import br.com.waxsolutions.clinicPlatformAPI.doctor.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorRepository repository;

    @PostMapping
    public void register(@RequestBody DataDoctorRegister data)
    {
        repository.save(new Doctor(data));
    }

}
