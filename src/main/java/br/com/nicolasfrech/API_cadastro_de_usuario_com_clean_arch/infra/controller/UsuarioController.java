package br.com.nicolasfrech.API_cadastro_de_usuario_com_clean_arch.infra.controller;

import br.com.nicolasfrech.API_cadastro_de_usuario_com_clean_arch.application.usecases.CriarUsuario;
import br.com.nicolasfrech.API_cadastro_de_usuario_com_clean_arch.application.usecases.DeletarUsuario;
import br.com.nicolasfrech.API_cadastro_de_usuario_com_clean_arch.application.usecases.ListarUsuarios;
import br.com.nicolasfrech.API_cadastro_de_usuario_com_clean_arch.domain.entities.usuario.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final CriarUsuario criarUsuario;
    private final ListarUsuarios listarUsuarios;
    private final DeletarUsuario deletarUsuario;

    public UsuarioController(CriarUsuario criarUsuario, ListarUsuarios listarUsuarios, DeletarUsuario deletarUsuario) {
        this.criarUsuario = criarUsuario;
        this.listarUsuarios = listarUsuarios;
        this.deletarUsuario = deletarUsuario;
    }

    @PostMapping
    public UsuarioDto cadastrarUsuario(@RequestBody UsuarioDto dto) {
        Usuario salvo = criarUsuario.cadastrarUsuario(new Usuario(dto.cpf(), dto.nome(), dto.nascimento(), dto.email()));

        return new UsuarioDto(salvo.getCpf(), salvo.getNome(), salvo.getNascimento(), salvo.getEmail());
    }

    @GetMapping
    public List<UsuarioDto> listarUsuarios() {
        return listarUsuarios.ListarUsuarios().stream()
                .map(u -> new UsuarioDto(u.getCpf(), u.getNome(), u.getNascimento(), u.getEmail()))
                .collect(Collectors.toList());
    }

    @DeleteMapping
    @RequestMapping("/{id}")
    public void deletarUsuario(@PathVariable Long id) {
        deletarUsuario.deletarUsuario(id);
    }
}
