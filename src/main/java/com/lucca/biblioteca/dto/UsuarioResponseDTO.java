package com.lucca.biblioteca.dto;


import java.time.LocalDateTime;

import com.lucca.biblioteca.entity.TipoUsuario;

public class UsuarioResponseDTO {
    

    private Long id;
    private String nome;
    private String email;
    private TipoUsuario tipoUsuario;
    private Boolean ativo;
    private LocalDateTime criadoEm;


    public UsuarioResponseDTO(
            Long id,
            String nome,
            String email,
            TipoUsuario tipoUsuario,
            Boolean ativo,
            LocalDateTime criadoEm
    ) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.tipoUsuario = tipoUsuario;
        this.ativo = ativo;
        this.criadoEm = criadoEm;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(LocalDateTime criadoEm) {
        this.criadoEm = criadoEm;
    }

}
