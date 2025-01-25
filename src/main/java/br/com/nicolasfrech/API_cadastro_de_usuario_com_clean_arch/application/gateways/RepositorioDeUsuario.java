package br.com.nicolasfrech.API_cadastro_de_usuario_com_clean_arch.application.gateways;

import br.com.nicolasfrech.API_cadastro_de_usuario_com_clean_arch.domain.entities.usuario.Usuario;

import java.util.List;

public interface RepositorioDeUsuario {

    Usuario cadastrarUsuario(Usuario usuario);

    List<Usuario> listarTodos();

    void deletarUsuario(Long id);
}
