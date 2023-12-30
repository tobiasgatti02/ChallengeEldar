import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        try {
            Tarjeta tarjeta1 = new Tarjeta("VISA", "1234567890123456", "Juan Perez", LocalDate.of(2025, 12, 31), new VisaEstrategia());
            Tarjeta tarjeta2 = new Tarjeta("AMEX", "2345678901234567", "Maria Lopez", LocalDate.of(2024, 11, 30), new AmexEstrategia());
            Operacion operacion = new Operacion(tarjeta1, 500);

            System.out.println(operacion);
            System.out.println(tarjeta1);

            System.out.println("¿Es válida la operación? " + operacion.esValida());

            System.out.println("¿Es válida la tarjeta para operar? " + tarjeta1.esValidaParaOperar());

            System.out.println("¿Son distintas las tarjetas? " + !tarjeta1.equals(tarjeta2));

            System.out.println("Tasa de la operación: " + tarjeta1.obtenerTasa(operacion));
        } catch (Exception e) {

            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }
}
