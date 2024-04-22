package br.com.waxsolutions.clinicPlatformAPI.controller;

import br.com.waxsolutions.clinicPlatformAPI.domain.doctor.DTODoctorRegister;
import br.com.waxsolutions.clinicPlatformAPI.domain.doctor.DTOListDoctor;
import br.com.waxsolutions.clinicPlatformAPI.domain.doctor.Doctor;
import br.com.waxsolutions.clinicPlatformAPI.repositories.DoctorRepository;
import br.com.waxsolutions.clinicPlatformAPI.domain.doctor.DTODoctorUpdate;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorRepository repository;

    @PostMapping
    @Transactional
    public void register(@RequestBody @Valid DTODoctorRegister data) {
        repository.save(new Doctor(data));
    }

    @GetMapping
    public List<DTOListDoctor> listDoctors() {
        return repository.findAll().stream().map(DTOListDoctor::new).toList();
    }

    @PutMapping
    @Transactional
    public void update(@RequestBody @Valid DTODoctorUpdate data) {
        var doctor = repository.getReferenceById(data.id());
        doctor.updateData(data);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity delete(@PathVariable Long id) {
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
