package br.com.waxsolutions.clinicPlatformAPI.domain.patient;

import br.com.waxsolutions.clinicPlatformAPI.domain.address.DataAddress;
import jakarta.validation.constraints.NotNull;

public record DTOPatientUpdate(@NotNull Long id, String nome, String telefone, DataAddress endereco) {
}
