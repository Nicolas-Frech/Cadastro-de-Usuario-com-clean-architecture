package br.com.nicolasfrech.API_cadastro_de_usuario_com_clean_arch.domain.entities.usuario;

import br.com.nicolasfrech.API_cadastro_de_usuario_com_clean_arch.domain.Endereco;

import java.time.LocalDate;

public class Usuario {

    private String cpf;
    private String nome;
    private LocalDate nascimento;
    private String email;
    private Endereco endereco;

    public Usuario(String cpf, String nome, LocalDate nascimento, String email) {
        if (cpf == null || !cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
            throw new IllegalArgumentException("CPF no formato errado!");
        }

        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
