package com.alura.foroinicial.Entities;

import jakarta.validation.constraints.NotBlank;

public record DtoRegistroTopico(
        @NotBlank String titulo,
        @NotBlank String mensaje,
        @NotBlank String autor,
        @NotBlank String curso
) {
}
