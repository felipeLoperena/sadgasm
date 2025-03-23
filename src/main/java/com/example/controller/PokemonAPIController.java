package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Pokemon;
import com.example.service.PokemonAPIService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/pokemon")
public class PokemonAPIController {
    
    private final PokemonAPIService pokemonAPIService;

    public PokemonAPIController(PokemonAPIService pokemonAPIService) {
        this.pokemonAPIService = pokemonAPIService;
    }

    @GetMapping("/{nombre}")
    public ResponseEntity<Pokemon> obtenerPokemon(@PathVariable String nombre) {
        return ResponseEntity.ok().body(pokemonAPIService.obtenerPokemon(nombre));
    }
    
}
