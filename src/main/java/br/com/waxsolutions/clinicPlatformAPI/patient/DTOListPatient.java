package br.com.waxsolutions.clinicPlatformAPI.patient;

import br.com.waxsolutions.clinicPlatformAPI.doctor.Doctor;

public record DTOListPatient(Long id,String nome, String email) {

    public DTOListPatient(Patient patient){
        this(patient.getId(), patient.getNome(), patient.getEmail());
    }

}
