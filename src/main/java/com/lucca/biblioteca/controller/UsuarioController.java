package com.lucca.biblioteca.controller;

import com.lucca.biblioteca.dto.UsuarioRequestDTO;
import com.lucca.biblioteca.dto.UsuarioResponseDTO;
import com.lucca.biblioteca.entity.Usuario;
import com.lucca.biblioteca.service.UsuarioService;

import jakarta.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import java.util.List;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<UsuarioResponseDTO> criar(
    @Valid @RequestBody UsuarioRequestDTO dto
    ) {
    Usuario usuario = toEntity(dto);
    Usuario salvo = usuarioService.salvar(usuario);
    return ResponseEntity.ok(toDto(salvo));
    }
    

    @GetMapping
    public ResponseEntity<List<UsuarioResponseDTO>> listarTodos() {
        return ResponseEntity.ok(usuarioService.listarTodos().stream().map(this::toDto).toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioResponseDTO> buscarPorId(@PathVariable Long id) {
    Optional<Usuario> usuarioOpt = usuarioService.buscarPorId(id);

    if (usuarioOpt.isEmpty()) {
        return ResponseEntity.notFound().build();
    }

    return ResponseEntity.ok(toDto(usuarioOpt.get()));
}

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id) {
        usuarioService.remover(id);
        return ResponseEntity.noContent().build();
    }

    private UsuarioResponseDTO toDto(Usuario usuario) {
        return new UsuarioResponseDTO(
            usuario.getId(), 
            usuario.getNome(), 
            usuario.getEmail(), 
            usuario.getTipoUsuario(), 
            usuario.getAtivo(), 
            usuario.getCriadoEm());
    }

    private Usuario toEntity(UsuarioRequestDTO dto) {
        Usuario usuario = new Usuario();
        usuario.setNome(dto.getNome());
        usuario.setEmail(dto.getEmail());
        usuario.setSenha(dto.getSenha());
        usuario.setTipoUsuario(dto.getTipoUsuario());
        usuario.setAtivo(true);
        return usuario;
    }


    @PutMapping("/{id}")
    public ResponseEntity<UsuarioResponseDTO> atualizar(
        @PathVariable Long id,
        @Valid @RequestBody UsuarioRequestDTO dto
    ) {
        Usuario usuario = toEntity(dto);
        Usuario atualizado = usuarioService.atualizar(id, usuario);
        return ResponseEntity.ok(toDto(atualizado));
    }




}
