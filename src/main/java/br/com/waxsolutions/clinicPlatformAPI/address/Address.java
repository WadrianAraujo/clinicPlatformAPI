package br.com.waxsolutions.clinicPlatformAPI.address;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String cidade;
    private String complemento;
    private String uf;

    public Address(DataAddress endereco) {
        this.logradouro = endereco.logradouro();
        this.bairro = endereco.bairro();
        this.cidade = endereco.cidade();
        this.cep = endereco.cep();
        this.numero = endereco.numero();
        this.complemento = endereco.complemento();
        this.uf = endereco.uf();
    }

    public void updateInfo(DataAddress endereco) {
        if (endereco.logradouro() != null){
            this.logradouro = endereco.logradouro();
        }

        if (endereco.bairro() != null){
            this.bairro = endereco.bairro();
        }

        if (endereco.cidade() != null){
            this.cidade = endereco.cidade();
        }

        if (endereco.cep() != null){
            this.cep = endereco.cep();
        }

        if (endereco.numero() != null){
            this.numero = endereco.numero();
        }

        if (endereco.complemento() != null){
            this.complemento = endereco.complemento();
        }

        if (endereco.uf() != null){
            this.uf = endereco.uf();
        }
    }
}
