package composite.portifolio;

import composite.modelo.*;

public class Tarefa extends Folha {

    public Tarefa(String nome) {
        super(nome);
    }

    @Override
    public void listar(int nivel) {
        tabular(nivel);
        System.out.println("Tarefa: " + this.getNome());  // Simplesmente imprime o nome da tarefa
    }
}
