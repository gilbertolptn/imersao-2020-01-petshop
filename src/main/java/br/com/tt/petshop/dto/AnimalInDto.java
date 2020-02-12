package br.com.tt.petshop.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDate;

public class AnimalInDto {

    @NotBlank(message = "O nome deve ser preenchido!")
//    @Pattern(regexp = "[\\w]{2,}[ ][\\w]{2,}", message = "Informe o nome completo")
    private String nome;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @NotNull(message = "Informe a data de nascimento!")
    @PastOrPresent(message = "O nascimento não pode ser futuro!")
    private LocalDate nascimento;

    @NotNull(message = "Informe o ID do Cliente")
    private Long clienteId;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

//    public Animal toEntity() {
//        Animal animal = new Animal();
//        animal.setNascimento(this.getNascimento());
//        animal.setNome(this.getNome());
//        return animal;
//    }
}
