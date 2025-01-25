package br.com.nicolasfrech.API_cadastro_de_usuario_com_clean_arch.application.usecases;

import br.com.nicolasfrech.API_cadastro_de_usuario_com_clean_arch.application.gateways.RepositorioDeUsuario;

public class DeletarUsuario {

    private final RepositorioDeUsuario repositorioDeUsuario;

    public DeletarUsuario(RepositorioDeUsuario repositorioDeUsuario) {
        this.repositorioDeUsuario = repositorioDeUsuario;
    }

    public void deletarUsuario(Long id) {
        repositorioDeUsuario.deletarUsuario(id);
    }
}
