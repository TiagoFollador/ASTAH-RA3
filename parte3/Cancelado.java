public class Cancelado extends Estado{
    @Override
    public Estado arquiva() {
        return new Arquivado();
    }
}
