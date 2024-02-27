package br.com.waxsolutions.clinicPlatformAPI.patient;

import br.com.waxsolutions.clinicPlatformAPI.address.Address;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "Patients")
@Entity(name = "patient")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String telefone;

    @Embedded
    private Address endereco;

    public Patient(DTOPatientRegister data) {
        this.nome = data.nome();
        this.email = data.email();
        this.telefone = data.telefone();
        this.endereco = new Address(data.endereco());
    }

    public void updateData(DTOPatientUpdate data) {
        if (data.nome() != null){
            this.nome = data.nome();
        }

        if (data.telefone() != null){
            this.telefone = data.telefone();
        }
        if (data.endereco() != null){
            this.endereco.updateInfo(data.endereco());
        }

    }
}
