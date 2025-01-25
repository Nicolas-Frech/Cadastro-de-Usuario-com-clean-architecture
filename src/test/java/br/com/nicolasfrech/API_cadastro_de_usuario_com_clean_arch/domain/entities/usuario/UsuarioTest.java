package br.com.nicolasfrech.API_cadastro_de_usuario_com_clean_arch.domain.entities.usuario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UsuarioTest {

    @Test
    void naoDeveCadastrarUsuarioComCpfNoFormatoErrado() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Usuario("123456789-00", "Nicolas", LocalDate.parse("2001-05-03"), "emal@email.com"));

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Usuario("12345678900", "Nicolas", LocalDate.parse("2001-05-03"), "emal@email.com"));

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Usuario("", "Nicolas", LocalDate.parse("2001-05-03"), "emal@email.com"));
    }
}
