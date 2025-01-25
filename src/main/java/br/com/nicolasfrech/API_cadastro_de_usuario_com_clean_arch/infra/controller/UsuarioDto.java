package br.com.nicolasfrech.API_cadastro_de_usuario_com_clean_arch.infra.controller;

import java.time.LocalDate;

public record UsuarioDto(
        String cpf,
        String nome,
        LocalDate nascimento,
        String email
) {

}
