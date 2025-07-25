package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.aspectj.apache.bcel.generic.Type;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.entity.Pokemon;
import com.example.entity.Pokemon.TypeWrapper;

@Service
public class PokemonAPIService {
    private final RestTemplate restTemplate = new RestTemplate();
    private final String API_URL = "https://pokeapi.co/api/v2/pokemon/";

    public Pokemon obtenerPokemon(String nombre) {
        String url = API_URL + nombre.toLowerCase();
        
        return restTemplate.getForObject(url, Pokemon.class);
    }

    public List<Pokemon> obtenerCatalogo(){
        List<Pokemon> listaCatalogoPokemon = new ArrayList<>();
        TypeWrapper typeWrapper = new TypeWrapper();
        TypeWrapper typeWrapperDos = new TypeWrapper();
        //typeWrapper.setType((Type) type);
        List<TypeWrapper> listTypeWrappers = new ArrayList<>();

        listTypeWrappers.add(typeWrapper);
        listTypeWrappers.add(typeWrapperDos);
        
        Pokemon pokemonUno = new Pokemon();
        pokemonUno.setName("Pikachu");
        pokemonUno.setWeight(50.0);
        pokemonUno.setHeight(10.0);
        pokemonUno.setTypes(listTypeWrappers);
        listaCatalogoPokemon.add(pokemonUno);

        Pokemon pokemonDos = new Pokemon();
        pokemonDos.setName("Squirle");
        pokemonDos.setWeight(15.0);
        listaCatalogoPokemon.add(pokemonDos);

        return listaCatalogoPokemon;
    }
}