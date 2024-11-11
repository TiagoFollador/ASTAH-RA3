package interpretador.prefixada;

import java.util.ArrayList;

public class Teste {

    public static void execute() {
        // Programa (Contexto) onde ficará armazenado as informações
        ArrayList<Expressao> programa = new ArrayList<>();

        // Criando Expressões Terminais (Folhas) e adicionando no contexto (terminais)
        Expressao n = new Constante(10); // Constante
        programa.add(n);

        Expressao c1 = new Constante(20.0); // Constante
        programa.add(c1);

        Expressao c2 = new Constante(40.0); // Constante
        programa.add(c2);

        Expressao v1 = new Variavel("v1", 10.0); // Variável
        programa.add(v1);

        Expressao v2 = new Variavel("v2", 100.0); // Variável
        programa.add(v2);

        Expressao v3 = new Variavel("v3", 5.0); // Variável

        // Fatorial de n
        ArrayList<Expressao> fatElement = new ArrayList<>();
        fatElement.add(n);
        Expressao fatorial = new Fatorial(fatElement);
        programa.add(fatorial);

        ArrayList<Expressao> fatElement2 = new ArrayList<>();
        fatElement2.add(v3);
        Expressao fatorial2 = new Fatorial(fatElement2);
        programa.add(fatorial2);

        // Adição: a = (+ c1 v1 fat)
        ArrayList<Expressao> la = new ArrayList<>();
        la.add(c1);
        la.add(v1);
        la.add(fatorial);
        Expressao a = new Adicao(la);
        programa.add(a);

        // Subtração: s = (- (+ c1 v1) v1)
        ArrayList<Expressao> ls = new ArrayList<>();
        ls.add(a);
        ls.add(v1);
        Expressao s = new Subtracao(ls);
        programa.add(s);

        // Divisão: d = (/ (- (+ c1 v1) v1) (+ c1 v1))
        ArrayList<Expressao> ld = new ArrayList<>();
        ld.add(s);
        ld.add(a);
        Expressao d = new Divisao(ld);
        programa.add(d);

        // Multiplicação: m = (* (+ c1 v1) (- (+ c1 v1) v1))
        ArrayList<Expressao> lm = new ArrayList<>();
        lm.add(a);
        lm.add(s);
        Expressao m = new Multiplicacao(lm);
        programa.add(m);

        // Nova expressão: (* (+ 20.0 v1:10.0) (- (+ 20.0 v1:10.0) v1:10.0))
        ArrayList<Expressao> innerAdd = new ArrayList<>();
        innerAdd.add(c1);
        innerAdd.add(v1);
        Expressao innerAddition = new Adicao(innerAdd);

        ArrayList<Expressao> innerSub = new ArrayList<>();
        innerSub.add(innerAddition);
        innerSub.add(v1);
        Expressao innerSubtraction = new Subtracao(innerSub);

        ArrayList<Expressao> newMult = new ArrayList<>();
        newMult.add(innerAddition);
        newMult.add(innerSubtraction);
        Expressao newMultiplication = new Multiplicacao(newMult);
        programa.add(newMultiplication);

        // mostre a string de cada expressao (toString) e resultado (resolva)
        for (Expressao p : programa) {
            System.out.println(p.toString() + " = " + p.resolva());
        }
    }

    public static void main(String[] args) {
        Teste.execute();
    }
}