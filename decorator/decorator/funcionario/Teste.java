
package decorator.funcionario;

public class Teste
{
    public static void execute()
    {
        Componente pedroMes11 = new Funcionario("Pedro", "Silva");
        Componente Joao = new Funcionario("João", "Silva");
        Componente Maria = new Funcionario("Maria", "Silva");
        Componente AnalistaDeSistemaPrdro1, ArquitetoDeSoftwarePedro1, AnalistaDeSistemaPedro2, ArquitetoDeSoftwarePedro2, TestadorDeSoftwarePedro1, ProgramadorJoao, ImplantadorJoao, TreinamentoDeUsuarioJoao, AnalistaDeSistemaMaria1, TestadorDeSoftwareMaria1, ProgramadorMaria;
        try{
            //PEDRO
            AnalistaDeSistemaPrdro1 = new AnalistaDeSistema(80f, 40f);
            AnalistaDeSistemaPrdro1.aponta( pedroMes11 );
            ArquitetoDeSoftwarePedro1 = new ArquitetoDeSoftware(20F, 50F);
            ArquitetoDeSoftwarePedro1.aponta( AnalistaDeSistemaPrdro1 );
            AnalistaDeSistemaPedro2 = new AnalistaDeSistema(40F, 40F);
            AnalistaDeSistemaPedro2.aponta( ArquitetoDeSoftwarePedro1 );
            ArquitetoDeSoftwarePedro2 = new ArquitetoDeSoftware(20F, 50F);
            ArquitetoDeSoftwarePedro2.aponta( AnalistaDeSistemaPedro2 );
            TestadorDeSoftwarePedro1 = new TestadorDeSoftware(20F, 30F);
            TestadorDeSoftwarePedro1.aponta( ArquitetoDeSoftwarePedro2 );

            //ATIVIDADES JOÃO
            ProgramadorJoao = new Programador(80, 20);
            ProgramadorJoao.aponta(Joao);
            ImplantadorJoao = new Implantador(40, 40);
            ImplantadorJoao.aponta(ProgramadorJoao);
            TreinamentoDeUsuarioJoao = new TreinamentoDeUsuario(60, 40);
            TreinamentoDeUsuarioJoao.aponta(ImplantadorJoao);

            //ATIVIDADES MARIA
            AnalistaDeSistemaMaria1 = new AnalistaDeSistema(90, 30);
            AnalistaDeSistemaMaria1.aponta(Maria);
            TestadorDeSoftwareMaria1 = new TestadorDeSoftware(20, 40);
            TestadorDeSoftwareMaria1.aponta(AnalistaDeSistemaMaria1);
            ProgramadorMaria = new Programador(70, 20);
            ProgramadorMaria.aponta(TestadorDeSoftwareMaria1);

            double PedroSalario = TestadorDeSoftwarePedro1.calculaSalario();
            double JoaoSalario = TreinamentoDeUsuarioJoao.calculaSalario();
            double MariasSalario = ProgramadorMaria.calculaSalario();
            System.out.println(TestadorDeSoftwarePedro1.toString());
            System.out.println("Salario: "+ PedroSalario);
            System.out.println(TreinamentoDeUsuarioJoao.toString());
            System.out.println("Salario: " + JoaoSalario);
            System.out.println(ProgramadorMaria.toString());
            System.out.println("Salario: " + MariasSalario);
   
            /*     
            Funcionario: Pedro Silva
            :- Atividade executada: Analista de sistema
              [Numero de horas = 80.0, Valor hora = 40.0] = 3200.0
            :- Atividade executada: Arquiteto de software
              [Numero de horas = 20.0, Valor hora = 50.0] = 1000.0
            :- Atividade executada: Analista de sistema
               [Numero de horas = 40.0, Valor hora = 40.0] = 1600.0
            :- Atividade executada: Arquiteto de software
               [Numero de horas = 20.0, Valor hora = 50.0] = 1000.0
            :- Atividade executada: Testador de Software
               [Numero de horas = 20.0, Valor hora = 30.0] = 600.0
            Salario: 7400.00
            */           
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String [] args){
        
        Teste.execute();
        
    }
}