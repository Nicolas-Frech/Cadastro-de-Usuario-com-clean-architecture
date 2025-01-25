package br.com.nicolasfrech.API_cadastro_de_usuario_com_clean_arch.domain.entities.usuario;

import br.com.nicolasfrech.API_cadastro_de_usuario_com_clean_arch.domain.Endereco;

import java.time.LocalDate;

public class FabricaDeUsuario {

    private Usuario usuario;

    public Usuario comNomeCpfNascimento(String nome, String cpf, LocalDate nascimento) {
        this.usuario = new Usuario(cpf, nome, nascimento, "");
        return this.usuario;
    }

    public Usuario adicionaEndereco(String cep, Integer numero, String complemento) {
        this.usuario.setEndereco(new Endereco(cep, numero, complemento));
        return this.usuario;
    }
}
