public class Faturado extends Estado{

    @Override
    public Estado paga() {
        return new Pago();
    }

    @Override
    public Estado arquiva() {
        return new Arquivado();
    }
}
