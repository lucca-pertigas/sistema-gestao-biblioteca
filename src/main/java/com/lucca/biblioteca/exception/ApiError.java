package com.lucca.biblioteca.exception;

import java.time.LocalDateTime;

public class ApiError {

    private int status;
    private String erro;
    private LocalDateTime timestamp;

    public ApiError(int status, String erro) {
        this.status = status;
        this.erro = erro;
        this.timestamp = LocalDateTime.now();
    }

    public int getStatus() {
        return status;
    }

    public String getErro() {
        return erro;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
