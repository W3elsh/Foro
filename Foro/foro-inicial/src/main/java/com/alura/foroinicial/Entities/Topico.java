package com.alura.foroinicial.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "topicos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String titulo;
    @Column(unique = true)
    private String mensaje;
    private LocalDateTime fechaCreacion = LocalDateTime.now();
    @Enumerated(EnumType.STRING)
    private StatusTopico estatus = StatusTopico.NO_RESPONDIDO;
    private String autor;
    private String curso;


    public Topico(DtoRegistroTopico registro) {
        this.titulo = registro.titulo();
        this.mensaje = registro.mensaje();
        this.autor = registro.autor();
        this.curso = registro.curso();
    }

    public void actualizar(DtoModificarTopico registro) {
        if(registro.autor() != null){
            this.autor = registro.autor();
        }
        if(registro.curso() != null){
            this.curso = registro.curso();
        }
        if(registro.mensaje() != null){
            this.mensaje = registro.mensaje();
        }
        if(registro.titulo() != null){
            this.titulo = registro.titulo();
        }
    }
}
