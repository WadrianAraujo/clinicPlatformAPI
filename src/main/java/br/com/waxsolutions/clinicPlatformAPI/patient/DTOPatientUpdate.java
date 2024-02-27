package br.com.waxsolutions.clinicPlatformAPI.patient;

import br.com.waxsolutions.clinicPlatformAPI.address.DataAddress;
import jakarta.validation.constraints.NotNull;

public record DTOPatientUpdate(@NotNull Long id, String nome, String telefone, DataAddress endereco) {
}
