package br.com.waxsolutions.clinicPlatformAPI.domain.doctor;

import br.com.waxsolutions.clinicPlatformAPI.domain.address.DataAddress;
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
        @NotNull
        Specialty especialidade,
        @NotNull
        @Valid
        DataAddress endereco
) {
}
