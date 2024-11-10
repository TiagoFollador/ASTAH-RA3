package composite.categoria;

import composite.modelo.Folha;

public class Cereal extends Folha {
    public Cereal(String nm) {
        super(nm);
    }
    @Override
    public void listar(int nivel){
        tabular(nivel);
        System.out.println("Cereal: " + this.nome);

    }
}
