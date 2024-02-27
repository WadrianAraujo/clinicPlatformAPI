package br.com.waxsolutions.clinicPlatformAPI.doctor;

import br.com.waxsolutions.clinicPlatformAPI.address.DataAddress;
import jakarta.validation.constraints.NotNull;

public record DTODoctorUpdate(@NotNull Long id, String nome, String telefone, DataAddress endereco) {



}
