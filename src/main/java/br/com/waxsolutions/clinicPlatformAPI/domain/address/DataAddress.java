package br.com.waxsolutions.clinicPlatformAPI.domain.address;

import jakarta.validation.constraints.NotBlank;

public record DataAddress(
        @NotBlank
        String logradouro,
        @NotBlank
        String bairro,
        @NotBlank
        String cep,
        @NotBlank
        String cidade,
        @NotBlank
        String uf,
        @NotBlank
        String numero,
        @NotBlank
        String complemento) {
}
