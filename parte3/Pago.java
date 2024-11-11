public class Pago extends Estado{
    @Override
    public Estado arquiva() {
        return new Arquivado();
    }
}
