package composite.portifolio;

import composite.modelo.*;

public class Projeto extends Composicao {

    public Projeto(String nome) {
        super(nome);
    }

    @Override
    public boolean adicionar(Elemento d) throws MyException {
        // Permite adicionar apenas Atividade ou Projeto em um Projeto
        if (d instanceof Projeto || d instanceof Atividade) {
            return super.adicionar(d);
        }
        throw new MyException("Não é possível adicionar este elemento em um projeto.");
    }

    @Override
    public void listar(int nivel) {
        tabular(nivel);
        System.out.println("Projeto: " + this.getNome());
        for (Elemento e : this.elemento) {
            e.listar(nivel + 1);  // Lista elementos dentro do projeto
        }
    }
}
