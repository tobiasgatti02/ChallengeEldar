import java.time.LocalDate;

public class Tarjeta {
    private String marca;
    private String numero;
    private String cardholder;
    private LocalDate fechaVencimiento;

    private TasaEstrategia estrategia;

    public Tarjeta(String marca, String numero, String cardholder, LocalDate fechaVencimiento, TasaEstrategia estrategia) {
        this.marca = marca;
        this.numero = numero;
        this.cardholder = cardholder;
        this.fechaVencimiento = fechaVencimiento;
        this.estrategia = estrategia;
    }

    public boolean esValidaParaOperar() {
        return LocalDate.now().isBefore(fechaVencimiento);
    }

    public String obtenerTasa(Operacion valor) throws Exception {
        double tasa = estrategia.calcularTasa(valor);
        return "Marca: " + marca + " " + tasa;
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
