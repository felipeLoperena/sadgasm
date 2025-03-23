package com.example.service;

import org.springframework.web.client.RestTemplate;

import com.example.entity.Pokemon;

public class PokemonAPIService {
    private final RestTemplate restTemplate = new RestTemplate();
    private final String API_URL = "https://pokeapi.co/api/v2/pokemon/";

    public Pokemon obtenerPokemon(String nombre) {
        String url = API_URL + nombre.toLowerCase();
        
        return restTemplate.getForObject(url, Pokemon.class);
    }
}