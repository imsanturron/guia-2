package com.company;

import java.util.UUID;

public class Cliente {
    private UUID id;
    private String nombre;
    private String email;
    private double porcentDescuento;

    public Cliente(String nombre, String email, double porcentDescuento) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.email = email;
        this.porcentDescuento = porcentDescuento;
    }

    public String getFullCliente() {
        return "id:" + id + "   nombre:" + nombre + "  email:" + email + "  descuento:" + porcentDescuento + "%";
    }

    public double getPorcentDescuento() {
        return porcentDescuento;
    }

    public UUID getId() {
        return id;
    }
}
