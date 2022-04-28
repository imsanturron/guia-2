package com.company;

import java.util.UUID;
import java.time.LocalDateTime;

public class Factura {
    private UUID id;
    private double montoTotal;
    private double montoTotalconDescuento;
    private LocalDateTime fecha;
    private Cliente clientex;

    public Factura(double montoTotal, Cliente clientex) {
        this.id = UUID.randomUUID();
        this.montoTotal = montoTotal;
        this.montoTotalconDescuento = montoTotal * (1 - (clientex.getPorcentDescuento() / 100));
        this.fecha = LocalDateTime.now();
        this.clientex = clientex;
    }

    public String getFacturaFull() {
        return ("----- " + "id:" + id + "   montoTotal:" + montoTotal + "  luego del descuento:" + montoTotalconDescuento +
                "  fecha:" + fecha + "\n" + "      info cliente:" + clientex.getFullCliente() + " -----");
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public String getMontoFull() {
        return ("montoTotal:" + montoTotal + "   luego del descuento:" + montoTotalconDescuento);
    }
}
