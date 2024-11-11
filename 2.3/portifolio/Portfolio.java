package composite.portifolio;

import composite.modelo.Composicao;
import composite.modelo.Elemento;

public class Portfolio extends Composicao {

    public Portfolio(String nome) {
        super(nome);
    }

    @Override
    public void listar(int nivel) {
        tabular(nivel);
        System.out.println("Portfólio: " + this.getNome());
        for (Elemento e : this.elemento) {
            e.listar(nivel + 1);
        }
    }
}
