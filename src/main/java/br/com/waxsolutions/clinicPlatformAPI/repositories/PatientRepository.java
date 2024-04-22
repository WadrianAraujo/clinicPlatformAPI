package br.com.waxsolutions.clinicPlatformAPI.repositories;

import br.com.waxsolutions.clinicPlatformAPI.domain.patient.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
