package br.com.waxsolutions.clinicPlatformAPI.domain.doctor;

import br.com.waxsolutions.clinicPlatformAPI.domain.address.Address;

public record DTOListDoctor(Long id, String nome, String email, String crm, Specialty especialidade, String phone, Address address) {

    public DTOListDoctor(Doctor doctor) {
        this(doctor.getId(), doctor.getNome(), doctor.getEmail() ,doctor.getCrm(), doctor.getEspecialidade(), doctor.getTelefone(), doctor.getEndereco());
    }

}
