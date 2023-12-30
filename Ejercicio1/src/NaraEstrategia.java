import java.time.LocalDate;

public class NaraEstrategia implements TasaEstrategia {
    @Override
    public int calcularTasa(Operacion o) {
        return (int) (o.getImporte()*(LocalDate.now().getDayOfMonth() * 0.5));
    }
}