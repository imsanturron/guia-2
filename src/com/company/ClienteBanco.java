package com.company;

import java.util.UUID;

public class ClienteBanco {
    private UUID id;
    private String nombre;
    private char genero;

    public ClienteBanco(String nombre, char genero) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getFullClienteBanco() {
        return "id:" + id + "   nombre:" + nombre + "  genero:" + genero;
    }

    public String getNombre() {
        return nombre;
    }
}
