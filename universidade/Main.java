package composite.universidade;

import composite.modelo.Elemento;
import composite.modelo.MyException;

public class Main {

    public static void main(String[] args) {
        try {
            // Criando o campus universitário
            Elemento campus = criarCampus();

            // Listando a estrutura do campus
            campus.listar(0);  // Deve listar todos os blocos, andares, salas, etc.

            System.out.println("\n");

            // Consultando um elemento específico
            Elemento salaConsultada = campus.consultar("Sala 101");
            salaConsultada.listar(0);

            System.out.println("\n");

            // Excluindo um elemento
            Elemento salaExcluida = campus.excluir("Sala 101");
            System.out.println("Sala excluída: " + salaExcluida.getNome());

            // Listando novamente a estrutura após a exclusão
            campus.listar(0);

        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }

    private static Elemento criarCampus() {
        // Criando o campus
        Elemento campus = new Campus("Campus Principal");

        // Criando blocos
        Elemento blocoA = new Bloco("Bloco A");
        Elemento blocoB = new Bloco("Bloco B");

        // Criando andares nos blocos
        Elemento andar1 = new Andar("Andar 1");
        Elemento andar2 = new Andar("Andar 2");

        // Criando salas, corredores, laboratórios e auditórios
        Elemento sala1 = new Sala("Sala 101");
        Elemento sala2 = new Sala("Sala 102");
        Elemento corredor1 = new Corredor("Corredor A");
        Elemento laboratorio1 = new Laboratorio("Laboratório 1");
        Elemento auditorio1 = new Auditorio("Auditório 1");

        try {
            // Adicionando elementos nas respectivas composições
            andar1.adicionar(sala1);
            andar1.adicionar(sala2);
            andar1.adicionar(corredor1);
            andar1.adicionar(laboratorio1);
            andar1.adicionar(auditorio1);

            blocoA.adicionar(andar1);
            blocoB.adicionar(andar2);

            campus.adicionar(blocoA);
            campus.adicionar(blocoB);

        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        return campus;
    }
}
