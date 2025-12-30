package com.lucca.biblioteca.service;

import com.lucca.biblioteca.dto.UsuarioRequestDTO;
import com.lucca.biblioteca.entity.Usuario;
import com.lucca.biblioteca.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> listarTodos() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> buscarPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    public Usuario buscarPorEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }

    public void remover(Long id) {
        usuarioRepository.deleteById(id);
    }

    public Usuario atualizar(Long id, UsuarioRequestDTO dto) {

    Usuario usuario = usuarioRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        usuario.setNome(dto.getNome());
        usuario.setEmail(dto.getEmail());
        usuario.setSenha(dto.getSenha());
        usuario.setTipoUsuario(dto.getTipoUsuario());
        usuario.setAtivo(dto.getAtivo());

        return usuarioRepository.save(usuario);
    }

    public Usuario atualizar(Long id, Usuario usuarioAtualizado) {
        Usuario usuario = usuarioRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        usuario.setNome(usuarioAtualizado.getNome());
        usuario.setEmail(usuarioAtualizado.getEmail());
        usuario.setTipoUsuario(usuarioAtualizado.getTipoUsuario());
        usuario.setAtivo(usuarioAtualizado.getAtivo());

        return usuarioRepository.save(usuario);
    }

}
