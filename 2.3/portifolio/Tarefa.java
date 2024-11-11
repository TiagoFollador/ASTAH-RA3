package composite.portifolio;

import composite.modelo.Folha;

public class Tarefa extends Folha {

    public Tarefa(String nome) {
        super(nome);
    }

    @Override
    public void listar(int nivel) {
        tabular(nivel);
        System.out.println("Tarefa: " + this.getNome());
    }
}
