package com.rest.testeorest;

public class Operacion {
    private Tarjeta tarjeta;
    private double importe;

    public Operacion(Tarjeta tarjeta, double importe) {
        this.tarjeta = tarjeta;
        this.importe = importe;
    }

    public boolean esValida() {
        return importe < 1000 && tarjeta.esValidaParaOperar();
    }


    public Tarjeta getTarjeta() {
        return tarjeta;
    }


    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
}
