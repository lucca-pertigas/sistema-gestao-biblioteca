package com.lucca.biblioteca.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class LivroRequestDTO {
    
    @NotBlank(message = "Titulo é obrigatório")
    @Size(max = 250)
    private String titulo;

    @NotBlank(message = "Autor é obrigatório")
    @Size(max = 250)
    private String autor;

    @NotBlank(message = "ISBN é obrigatório")
    @Size(max = 20)
    private String isbn;

    @NotNull(message = "Ano do livro é obrigatório")
    private Integer anoPublicacao;

    @NotBlank(message = "Categoria do livro é obrigatória")
    private String categoria;

    @NotBlank(message = "Sinopse do livro é obrigatória")
    @Size(max = 2000)
    private String sinopse;

    private String imagemCapa;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getImagemCapa() {
        return imagemCapa;
    }

    public void setImagemCapa(String imagemCapa) {
        this.imagemCapa = imagemCapa;
    }
}
