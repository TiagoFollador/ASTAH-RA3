package composite.categoria;

import composite.modelo.Folha;

public class Defumado extends Folha {
    public Defumado(String nm) {
        super(nm);
    }

    @Override
    public void listar(int nivel){
        tabular(nivel);
        System.out.println("Defumado: " + this.nome);

    }
}
