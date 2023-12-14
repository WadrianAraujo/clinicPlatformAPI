package br.com.waxsolutions.clinicPlatformAPI.controller;

import br.com.waxsolutions.clinicPlatformAPI.doctor.DataDoctorRegister;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @PostMapping
    public void register(@RequestBody DataDoctorRegister data){
        System.out.println(data);
    }

}
