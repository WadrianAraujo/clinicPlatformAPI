package br.com.waxsolutions.clinicPlatformAPI.doctor;

public record DTOListDoctor(Long id,String nome, String email, String crm, Specialty especialidade) {

    public DTOListDoctor(Doctor doctor){
        this(doctor.getId(),doctor.getNome(), doctor.getCrm(), doctor.getEmail(), doctor.getEspecialidade());
    }

}
