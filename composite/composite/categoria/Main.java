package composite.categoria;

import composite.modelo.Elemento;
import composite.modelo.MyException;

public class Main {
    private static Elemento criarInstancias(){

        Elemento CRaiz = new CategoriaRaiz("CRaiz");

        Elemento limpeza = new CategoriaFolha("limpeza");
            Elemento L1 = new Limpeza("L1");
            Elemento L2 = new Limpeza("L2");
            Elemento L3 = new Limpeza("L3");

        Elemento comestivel = new Categoria("comestivel");
            Elemento diversos = new Categoria("diversos");
                Elemento cereal = new CategoriaFolha("cereal");
                    Elemento P1 = new Cereal("P1");
                    Elemento P2 = new Cereal("P2");
                    Elemento P3 = new Cereal("P3");

                Elemento bebida = new CategoriaFolha("beboda");
                    Elemento P4 = new Bebida("P4");
                    Elemento P5 = new Bebida("P5");
                    Elemento P6 = new Bebida("P6");

            Elemento proteinaAnimal = new Categoria("proteinaAnimal");
                Elemento defumado = new CategoriaFolha("defumado");
                    Elemento P7 = new Defumado("P7");
                    Elemento P8 = new Defumado("P8");
                    Elemento P9 = new Defumado("P9");

                Elemento carne = new CategoriaFolha("carne");
                    Elemento P10 = new Carne("P10");
                    Elemento P11 = new Carne("P11");
                    Elemento P12 = new Carne("P12");

        try {
            cereal.adicionar(P1);
            cereal.adicionar(P2);
            cereal.adicionar(P3);

            bebida.adicionar(P4);
            bebida.adicionar(P5);
            bebida.adicionar(P6);

            defumado.adicionar(P7);
            defumado.adicionar(P7);
            defumado.adicionar(P7);

            carne.adicionar(P10);
            carne.adicionar(P11);
            carne.adicionar(P12);



        } catch (MyException e) {
            throw new RuntimeException(e);
        }
    }
}
