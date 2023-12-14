package br.com.waxsolutions.clinicPlatformAPI.doctor;

import br.com.waxsolutions.clinicPlatformAPI.address.DataAddress;

public record DataDoctorRegister(
        String nome,
        String email,
        String numero,
        String crm,
        Specialty especialidade,
        DataAddress endereco
) {
}
