public class Rejeitado extends Estado{
    @Override
    public Estado arquiva() {
        return new Arquivado();
    }
}
