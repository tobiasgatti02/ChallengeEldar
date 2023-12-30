import java.time.LocalDate;

public class AmexEstrategia implements TasaEstrategia {
    @Override
    public int calcularTasa(Operacion o) {
        return (int) (o.getImporte()*(LocalDate.now().getMonthValue() * 0.1));
    }
}