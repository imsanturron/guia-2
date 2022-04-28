package com.company;

public class Libro {
    private String titulo;
    private double precio;
    private int stock;
    private Autor autorx;

    public Libro(String titulo, double precio, int stock, Autor autorx) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autorx = autorx;
    }

    public String getFullLibro() {
        return "titulo:" + titulo + "   precio:" + precio + "  stock:" + stock + " autor:" + autorx.getNombreyApellido();
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public void setAumentarStock(int masStock) {
        this.stock += masStock;
    }
}
