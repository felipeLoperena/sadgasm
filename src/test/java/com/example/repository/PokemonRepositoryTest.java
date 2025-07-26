package com.example.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;

import com.example.entity.Pokemon;

@ActiveProfiles("test")
@DataJpaTest
@Sql(scripts = "/data-pokemon.sql")
public class PokemonRepositoryTest {

    @Value("${app.test.config}")
    String configMessage;

    @Test
    void verificaPerfilDeTest() {
        System.out.println(">>>> " + configMessage);
    }
    
    @Autowired
    private PokemonRepository pokemonRepository;

    @Test
    void guardaPokemon(){
        Pokemon pokemon = new Pokemon();
        pokemon.setName("Pikachu");

        pokemonRepository.save(pokemon);

        Optional<Pokemon> guardaPokemon = pokemonRepository.findByName("Pikachu");

        assertTrue(guardaPokemon.isPresent());
        assertEquals("Pikachu", guardaPokemon.get().getName());
}
         
}
