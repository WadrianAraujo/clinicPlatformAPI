package br.com.waxsolutions.clinicPlatformAPI.domain.doctor;

import br.com.waxsolutions.clinicPlatformAPI.domain.address.Address;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "doctors")
@Entity(name = "Doctor")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Doctor {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String crm;
    private String telefone;

    @Enumerated(EnumType.STRING)
    private Specialty especialidade;

    @Embedded
    private Address endereco;

    public Doctor(DTODoctorRegister data) {
        this.nome = data.nome();
        this.email = data.email();
        this.crm = data.crm();
        this.telefone = data.numero();
        this.endereco = new Address(data.endereco());
        this.especialidade = data.especialidade();
    }

    public void updateData(DTODoctorUpdate data){
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
