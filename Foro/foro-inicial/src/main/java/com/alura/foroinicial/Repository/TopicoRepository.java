package com.alura.foroinicial.Repository;

import com.alura.foroinicial.Entities.Topico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicoRepository extends JpaRepository<Topico, Long> {
}
