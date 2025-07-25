package com.example.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "pokemon")
public class Pokemon{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;
    private Double height;
    private Double weight;
    
    @Transient
    private List<TypeWrapper> types;

    // Getters y Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Double getHeight() { return height; }
    public void setHeight(Double height) { this.height = height; }

    public Double getWeight() { return weight; }
    public void setWeight(Double weight) { this.weight = weight; }

    public List<TypeWrapper> getTypes() { return types; }
    public void setTypes(List<TypeWrapper> types) { this.types = types; }

    // Para manejar el tipo del Pokémon
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class TypeWrapper {
        private Type type;
        public Type getType() { return type; }
        public void setType(Type type) { this.type = type; }
    }
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Type {
        private String name;
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
    }
}

