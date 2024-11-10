package composite.categoria;

import composite.modelo.Composicao;

public class Categoria extends Composicao {
    public Categoria(String nm) {
        super(nm);
    }
    @Override
    public void listar(int nivel){
        tabular(nivel);
    }
}
