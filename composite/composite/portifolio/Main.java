package composite.portifolio;

import composite.modelo.*;

public class Main {

    private static Elemento criarInstancias() {
        Elemento portfólio = new Portfolio("Portfólio de Projetos");

        Elemento projeto1 = new Projeto("Projeto A");
        Elemento projeto2 = new Projeto("Projeto B");

        Elemento atividade1 = new Atividade("Atividade A1");
        Elemento atividade2 = new Atividade("Atividade A2");
        Elemento atividade3 = new Atividade("Atividade B1");

        Elemento tarefa1 = new Tarefa("Tarefa A1-1");
        Elemento tarefa2 = new Tarefa("Tarefa A1-2");
        Elemento tarefa3 = new Tarefa("Tarefa B1-1");

        try {
            // Adicionando tarefas nas atividades
            atividade1.adicionar(tarefa1);
            atividade1.adicionar(tarefa2);
            atividade3.adicionar(tarefa3);

            // Adicionando atividades nos projetos
            projeto1.adicionar(atividade1);
            projeto1.adicionar(atividade2);
            projeto2.adicionar(atividade3);

            portfólio.adicionar(projeto1);
            portfólio.adicionar(projeto2);

        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        return portfólio;
    }

    public static void main(String[] args) {
        try {
            Elemento portfólio = criarInstancias();
            portfólio.listar(0);  // Listando todos os projetos, atividades e tarefas

            System.out.println("\n");

            Elemento novoProjeto = new Projeto("Projeto C");
            Elemento novaAtividade = new Atividade("Atividade C1");
            Elemento novaTarefa = new Tarefa("Tarefa C1-1");

            novaAtividade.adicionar(novaTarefa);
            novoProjeto.adicionar(novaAtividade);

            portfólio.adicionar(novoProjeto);

            portfólio.listar(0);

            System.out.println("\n");

            Elemento projetoC = portfólio.consultar("Projeto C");
            projetoC.listar(0);

            Elemento tarefaExcluida = projetoC.excluir("Tarefa C1-1");
            System.out.println("Tarefa excluída: " + tarefaExcluida.getNome());

            portfólio.excluir("Projeto A");
            portfólio.listar(0);  // Listando após a exclusão

        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
