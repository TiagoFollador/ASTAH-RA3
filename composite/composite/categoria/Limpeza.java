package composite.categoria;

import composite.modelo.Folha;

public class Limpeza extends Folha {
    public Limpeza(String nm) {
        super(nm);
    }

    @Override
    public void listar(int nivel){
        tabular(nivel);
    }
}
