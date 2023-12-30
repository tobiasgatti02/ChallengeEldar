package com.rest.testeorest;

import java.time.LocalDate;

public class Tarjeta {
    private String marca;
    private String numero;
    private String cardholder;
    private LocalDate fechaVencimiento;




    public Tarjeta(String marca, String numero, String cardholder, LocalDate fechaVencimiento) {
        this.marca = marca;
        this.numero = numero;
        this.cardholder = cardholder;
        this.fechaVencimiento = fechaVencimiento;


    }

    public boolean esValidaParaOperar() {
        return LocalDate.now().isBefore(fechaVencimiento);
    }

    public String obtenerTasa(Operacion op)throws Exception {
        double tasa = calcularTasa(op);
        return "Marca: " + marca + " " + tasa;
    }

    private double calcularTasa(Operacion op) {
        double year = LocalDate.now().getYear();
        double ultimosDigitos = year % 100;
        switch (marca) {
            case "Amex":
                return op.getImporte()*(LocalDate.now().getMonthValue() * 0.1);
            case "Nara":
                return op.getImporte() *  (LocalDate.now().getDayOfMonth() * 0.5);
            case "Visa":
            return op.getImporte() * (ultimosDigitos / LocalDate.now().getMonthValue());
            default:
                throw new IllegalArgumentException("Marca de tarjeta no válida: " + marca);
        }
    }


    public boolean sonDistintas(Tarjeta t) {
        if (this == t) return true;
        if (t == null || getClass() != t.getClass()) return false;
        return numero.equals(t.numero);
    }

    @Override
    public String toString() {
        return "Modelo.Tarjeta{" +
                "marca='" + marca + '\'' +
                ", numero='" + numero + '\'' +
                ", cardholder='" + cardholder + '\'' +
                ", fechaVencimiento=" + fechaVencimiento +
                '}';
    }


    //crear getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumero() {
        return numero;
    }

}
