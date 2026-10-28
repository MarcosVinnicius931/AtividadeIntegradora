
public class DescontoPromocional implements Desconto {

    @Override
    public double aplicarDesconto(double valor) {
        return valor * 0.80; // 20% de desconto
    }
}
