package com.UnicornioAzulSA.reto_2.repository;

import com.UnicornioAzulSA.reto_2.entity.Temperatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TemperaturaRepository extends JpaRepository<Temperatura, Long> {
    Optional<Temperatura> findAllById(Long id);
}
