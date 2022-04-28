package com.company;

import java.util.UUID;

public class CuentaBancaria {
    private UUID id;
    private double balance;
    private ClienteBanco clientex;
    private String[][] infomovimientos = new String[50][10];
    private int cant = 0;

    public CuentaBancaria(double balance, ClienteBanco clientex) {
        this.id = UUID.randomUUID();
        this.balance = balance;
        this.clientex = clientex;
    }

    public void setDeposito(double deposito) {
        balance += deposito;
        cant++;
        registrarMovimiento(deposito, 'd');
    }

    public void setExtraccion(double extraccion) {
        if (balance - extraccion >= -2000) {
            balance -= extraccion;
            cant++;
            registrarMovimiento(extraccion, 'e');
        } else
            System.out.println("Atencion: no puede retirar esta suma de dinero");
    }

    public double getBalance() {
        return balance;
    }

    private void registrarMovimiento(double extORdep, char info) {
        if (info == 'e' || info == 'E') {
            infomovimientos[0][cant - 1] = (clientex.getNombre() + " retiro " + extORdep +
                    " de la cuenta. Balance:" + balance);
        } else {
            infomovimientos[0][cant - 1] = (clientex.getNombre() + " deposito " + extORdep +
                    " en la cuenta. Balance:" + balance);
        }
    }

    public void infoMovimientos() {
        for (int i = 0; i < cant; i++)
            System.out.println(infomovimientos[0][i]);

    }
}
