package composite.portifolio;


import composite.modelo.Folha;

public class Atividade extends Folha {

    public Atividade(String nome) {
        super(nome);
    }

    @Override
    public void listar(int nivel) {
        tabular(nivel);
        System.out.println("Atividade: " + this.getNome());
    }
}
