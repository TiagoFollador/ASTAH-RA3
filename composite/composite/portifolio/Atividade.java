package composite.portifolio;

import composite.modelo.*;

public class Atividade extends Composicao {

    public Atividade(String nome) {
        super(nome);
    }

    @Override
    public void listar(int nivel) {
        tabular(nivel);
        System.out.println("Atividade: " + this.getNome());
        for (Elemento e : this.elemento) {
            e.listar(nivel + 1);  // Lista as tarefas dentro da atividade
        }
    }
}
