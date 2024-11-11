public class Cotado extends Estado{

    @Override
    public Estado encomenda() {
        return new Encomendado();
    }

    @Override
    public Estado rejeita() {
        return new Rejeitado();
    }
}
