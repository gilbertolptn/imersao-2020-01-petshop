package br.com.tt.petshop.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "tb_cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cpf")
    @CPF(message = "Informe um CPF válido!")
    private String cpf;

// Ex: 2020-01-01   @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "nascimento")
    private LocalDate nascimento;

//    @Column(name = "ID_UNIDADE")
//    private Long idUnidade;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_UNIDADE")
    private Unidade unidade;

    @OneToMany(mappedBy = "cliente")
    private List<Animal> animais;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String nomeSanitizado = null;
        if(nome != null){
            nomeSanitizado = nome.trim()
                     .replaceAll("[ ]+"," ")
                    .replaceAll("[^a-zA-Z0-9 ]","");
        }
        this.nome = nomeSanitizado;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Unidade getUnidade() {
        return unidade;
    }

    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(List<Animal> animais) {
        this.animais = animais;
    }
}
