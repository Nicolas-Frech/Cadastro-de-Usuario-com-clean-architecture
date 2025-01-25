package br.com.nicolasfrech.API_cadastro_de_usuario_com_clean_arch.infra.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
    UsuarioEntity findByNome(String nome);
}
