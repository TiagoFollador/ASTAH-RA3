package composite.categoria;

import composite.modelo.Folha;

public class Carne extends Folha {
    public Carne(String nm) {
        super(nm);
    }

    @Override
    public void listar(int nivel){
        tabular(nivel);
        System.out.println("Carne: " + this.nome);
    }
}
