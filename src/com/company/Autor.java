package com.company;

public class Autor {
    private String nombre;
    private String apellido;
    private String email;
    private char genero;

    public Autor(String nombre, String apellido, String email, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.genero = genero;
    }

    public String getFullAutor() {
        return "nombre y apellido:" + nombre + " " + apellido + "   email:" + email + "  genero:" + genero;
    }

    public String getNombreyApellido() {
        return nombre + " " + apellido;
    }
}
