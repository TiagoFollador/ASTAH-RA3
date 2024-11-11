public class Solicitado extends Estado{


    @Override
    public  Estado cotacao(){
        return new Cotado();
    }
}
