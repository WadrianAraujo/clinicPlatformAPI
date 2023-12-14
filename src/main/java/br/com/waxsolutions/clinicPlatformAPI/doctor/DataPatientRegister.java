package br.com.waxsolutions.clinicPlatformAPI.doctor;

import br.com.waxsolutions.clinicPlatformAPI.address.DataAddress;

public record DataPatientRegister(
        String nome,
        String email,
        String numero,
        DataAddress endereco
) {
}
