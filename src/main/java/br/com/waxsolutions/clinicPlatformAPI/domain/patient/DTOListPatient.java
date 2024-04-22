package br.com.waxsolutions.clinicPlatformAPI.domain.patient;

public record DTOListPatient(Long id,String nome, String email) {

    public DTOListPatient(Patient patient){
        this(patient.getId(), patient.getNome(), patient.getEmail());
    }

}
