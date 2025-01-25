package br.com.nicolasfrech.API_cadastro_de_usuario_com_clean_arch.config;

import br.com.nicolasfrech.API_cadastro_de_usuario_com_clean_arch.application.gateways.RepositorioDeUsuario;
import br.com.nicolasfrech.API_cadastro_de_usuario_com_clean_arch.application.usecases.CriarUsuario;
import br.com.nicolasfrech.API_cadastro_de_usuario_com_clean_arch.application.usecases.ListarUsuarios;
import br.com.nicolasfrech.API_cadastro_de_usuario_com_clean_arch.infra.gateways.RepositorioDeUsuarioJpa;
import br.com.nicolasfrech.API_cadastro_de_usuario_com_clean_arch.infra.gateways.UsuarioEntityMapper;
import br.com.nicolasfrech.API_cadastro_de_usuario_com_clean_arch.infra.persistence.UsuarioRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsuarioConfig {

    @Bean
    CriarUsuario criarUsuario(RepositorioDeUsuario repositorioDeUsuario) {
        return new CriarUsuario(repositorioDeUsuario);
    }

    @Bean
    RepositorioDeUsuarioJpa criarRepositorioJpa(UsuarioRepository repository, UsuarioEntityMapper mapper) {
        return new RepositorioDeUsuarioJpa(repository, mapper);
    }

    @Bean
    UsuarioEntityMapper criarUsuarioEntityMapper() {
        return new UsuarioEntityMapper();
    }

    @Bean
    ListarUsuarios listarUsuarios(RepositorioDeUsuario repositorioDeUsuario) {
        return new ListarUsuarios((repositorioDeUsuario));
    }
}
