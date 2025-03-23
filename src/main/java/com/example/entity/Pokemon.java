package com.example.entity;

import java.util.List;

public class Pokemon {
    private String name;
    private int height;
    private int weight;
    private List<TypeWrapper> types;

    // Getters y Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getHeight() { return height; }
    public void setHeight(int height) { this.height = height; }

    public int getWeight() { return weight; }
    public void setWeight(int weight) { this.weight = weight; }

    public List<TypeWrapper> getTypes() { return types; }
    public void setTypes(List<TypeWrapper> types) { this.types = types; }

    // Para manejar el tipo del Pokémon
    public static class TypeWrapper {
        private Type type;
        public Type getType() { return type; }
        public void setType(Type type) { this.type = type; }
    }

    public static class Type {
        private String name;
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
    }
}

