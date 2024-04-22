package br.com.waxsolutions.clinicPlatformAPI.domain.doctor;

import br.com.waxsolutions.clinicPlatformAPI.domain.address.DataAddress;
import jakarta.validation.constraints.NotNull;

public record DTODoctorUpdate(@NotNull Long id, String nome, String telefone, DataAddress endereco) {



}
