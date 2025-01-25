package br.com.nicolasfrech.API_cadastro_de_usuario_com_clean_arch.application.usecases;

import br.com.nicolasfrech.API_cadastro_de_usuario_com_clean_arch.application.gateways.RepositorioDeUsuario;
import br.com.nicolasfrech.API_cadastro_de_usuario_com_clean_arch.domain.entities.usuario.Usuario;

import java.util.List;

public class ListarUsuarios {

    private final RepositorioDeUsuario repositorioDeUsuario;

    public ListarUsuarios(RepositorioDeUsuario repositorioDeUsuario) {
        this.repositorioDeUsuario = repositorioDeUsuario;
    }

    public List<Usuario> ListarUsuarios() {
        return repositorioDeUsuario.listarTodos();
    }
}
