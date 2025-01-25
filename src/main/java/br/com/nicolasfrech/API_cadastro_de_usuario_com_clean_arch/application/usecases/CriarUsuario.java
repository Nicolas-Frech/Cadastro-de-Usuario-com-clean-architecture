package br.com.nicolasfrech.API_cadastro_de_usuario_com_clean_arch.application.usecases;

import br.com.nicolasfrech.API_cadastro_de_usuario_com_clean_arch.application.gateways.RepositorioDeUsuario;
import br.com.nicolasfrech.API_cadastro_de_usuario_com_clean_arch.domain.entities.usuario.Usuario;

public class CriarUsuario {

    private final RepositorioDeUsuario repositorioDeUsuario;

    public CriarUsuario(RepositorioDeUsuario repositorioDeUsuario) {
        this.repositorioDeUsuario = repositorioDeUsuario;
    }

    public Usuario cadastrarUsuario(Usuario usuario) {
        return repositorioDeUsuario.cadastrarUsuario(usuario);
    }
}
