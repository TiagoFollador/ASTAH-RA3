public class Main {
    public static void main(String[] args) {
        Pedido p1 = new Pedido();

        String str = p1.solicita(); // deve retornar "Solicitado"
        System.out.println("p1-Estado : "+str); // deve mostrar "p1-Estado : Solicitado"


        str = p1.cotacao(); // deve retornar "Cotado"
        System.out.println("p1-Estado : "+str); // deve mostrar "p1-Estado : Cotado"

        str = p1.cotacao(); // deve retornar "Cotado" Aqui não houve mudança de estado
        System.out.println("p1-Estado : "+str); // deve mostrar "p1-Estado : Cotado"

        str = p1.rejeita(); // deve retornar "Cotado" Aqui não houve mudança de estado
        System.out.println("p1-Estado : "+str); // deve mostrar "p1-Estado : Cotado"

        str = p1.encomenda(); // deve retornar "Encomendado"
        System.out.println("p1-Estado : "+str); // deve mostrar "p1-Estado : Encomendado"

        str = p1.entrega(); // deve retornar "Faturado"
        System.out.println("p1-Estado : "+str); // deve mostrar "p1-Estado : Faturado"

        str = p1.paga(); // deve retornar "Pago"
        System.out.println("p1-Estado : "+str); // deve mostrar "p1-Estado : Pago"

        str = p1.arquiva(); // deve retornar "FIM"
        System.out.println("p1-Estado : "+str); // deve mostrar "p1-Estado : FIM"
    }
}