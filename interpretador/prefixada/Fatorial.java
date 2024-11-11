package interpretador.prefixada;

import java.util.ArrayList;

public class Fatorial extends Operador {

    public Fatorial(ArrayList<Expressao> elemento) {
        super(elemento);
    }

    @Override
    public char simbolo() {
        return '!';
    }

    @Override
    public double resolva() {
        if (elemento.size() != 1) {
            throw new IllegalArgumentException("Fatorial requer exatamente um operando");
        }
        double valor = elemento.get(0).resolva();
        if (valor < 0) {
            throw new IllegalArgumentException("Fatorial não é definido para números negativos");
        }
        return fatorial((int) valor);
    }

    private double fatorial(int n) {
        if (n <= 1) {
            return 1;
        }
        double result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    @Override
    public String toString() {
        return elemento.get(0).toString() + "!";
    }
}