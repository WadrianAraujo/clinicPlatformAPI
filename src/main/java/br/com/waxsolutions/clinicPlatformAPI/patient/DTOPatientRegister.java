package br.com.waxsolutions.clinicPlatformAPI.patient;

import br.com.waxsolutions.clinicPlatformAPI.address.DataAddress;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record DTOPatientRegister(
        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String telefone,
        @NotBlank
        String cpf,
        @NotBlank
        @Valid
        DataAddress endereco
) {
}
