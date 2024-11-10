package composite.categoria;

public class CategoriaFolha extends Categoria{
    public CategoriaFolha(String nm) {
        super(nm);
    }

    @Override
    public void listar(int nivel){
        tabular(nivel);
    }
}
