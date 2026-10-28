
import java.math.BigDecimal;
import java.math.RoundingMode;

public class AdaptadorPagamento implements RegistradorPagamento {

    private final SistemaLegado legado;

    public AdaptadorPagamento(SistemaLegado legado) {
        this.legado = legado;
    }

    @Override
    public void registrar(BigDecimal reais) {
        BigDecimal centavos = reais.multiply(new BigDecimal("100")).setScale(0, RoundingMode.HALF_UP);

        legado.registrarEmCentavos(centavos);
    }

}
