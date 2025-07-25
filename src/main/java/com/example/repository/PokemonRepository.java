package com.example.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Pokemon;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long>{
    Optional<Pokemon> findByName(String name);
}
