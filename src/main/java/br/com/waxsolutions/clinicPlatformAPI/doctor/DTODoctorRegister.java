package br.com.waxsolutions.clinicPlatformAPI.doctor;

import br.com.waxsolutions.clinicPlatformAPI.address.DataAddress;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DTODoctorRegister(
        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String numero,
        @NotBlank
        String crm,
        @NotBlank
        Specialty especialidade,
        @NotBlank
        @Valid
        DataAddress endereco
) {
}
