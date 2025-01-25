package br.com.nicolasfrech.API_cadastro_de_usuario_com_clean_arch.infra.gateways;

import br.com.nicolasfrech.API_cadastro_de_usuario_com_clean_arch.application.gateways.RepositorioDeUsuario;
import br.com.nicolasfrech.API_cadastro_de_usuario_com_clean_arch.domain.entities.usuario.Usuario;
import br.com.nicolasfrech.API_cadastro_de_usuario_com_clean_arch.infra.persistence.UsuarioEntity;
import br.com.nicolasfrech.API_cadastro_de_usuario_com_clean_arch.infra.persistence.UsuarioRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class RepositorioDeUsuarioJpa implements RepositorioDeUsuario {

    private final UsuarioRepository repository;

    private final UsuarioEntityMapper mapper;

    public RepositorioDeUsuarioJpa(UsuarioRepository repository, UsuarioEntityMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Usuario cadastrarUsuario(Usuario usuario) {
        UsuarioEntity entity = mapper.toEntity(usuario);
        repository.save(entity);
        return mapper.toDomain(entity);
    }

    @Override
    public List<Usuario> listarTodos() {
        return repository.findAll().stream()
                .map(mapper::toDomain).collect(Collectors.toList());
    }

    @Override
    public void deletarUsuario(Long id) {
        Optional<UsuarioEntity> usuario = repository.findById(id);
        if(usuario.isPresent()) {
            repository.delete(usuario.get());
        }
        else {
            throw new RuntimeException("Não há usuários com esse ID!");
        }
    }
}
