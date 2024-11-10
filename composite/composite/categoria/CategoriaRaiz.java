package composite.categoria;

public class CategoriaRaiz extends Categoria{
    public CategoriaRaiz(String nm) {
        super(nm);
    }

    @Override
    public void listar(int nivel){
        tabular(nivel);
    }
}
