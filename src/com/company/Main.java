package com.company;

public class Main {

    public static void main(String[] args) {
        punto1LibroAutor();
        punto2ClienteFactura();
        ////
        ClienteBanco clientex = new ClienteBanco("Santiago", 'M');
        System.out.println(clientex.getFullClienteBanco());
        CuentaBancaria cuentaClientex = new CuentaBancaria(10000, clientex);
        cuentaClientex.setDeposito(15000);
        cuentaClientex.setExtraccion(20000);
        System.out.println(cuentaClientex.getBalance());
        ///d variante de cuenta deudor?
        cuentaClientex.infoMovimientos();

    }

    public static void punto1LibroAutor() {
        Autor autor1 = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');
        Libro libro1 = new Libro("Effective Java", 450, 150, autor1);
        System.out.println(autor1.getFullAutor());
        System.out.println(libro1.getFullLibro());
        //System.out.println(libro1); ///punto f como?????
        ///punto h??
    }

    public static void punto2ClienteFactura() {
        Cliente clientex = new Cliente("Juan", "juan127@email.com", 50);
        Factura facturax = new Factura(1500, clientex);
        //System.out.println(clientex.getFullCliente());
        //System.out.println(facturax.getMontoFull());
        System.out.println(facturax.getFacturaFull());
        //System.out.println(facturax.getFecha());
        //System.out.println(clientex.getId());
        //falta punto E (es largo). deberia cambiar tod lo anterior
    }

}

