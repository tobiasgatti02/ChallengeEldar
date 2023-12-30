import java.time.LocalDate;

public class VisaEstrategia implements TasaEstrategia {
    @Override
    public int calcularTasa(Operacion op) {
        int year = LocalDate.now().getYear();
        int lastTwoDigits = year % 100;
        return (int)op.getImporte() * (lastTwoDigits / LocalDate.now().getMonthValue());
    }

}

