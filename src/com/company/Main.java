package com.company;

public class Main {
    public static void main(String[] args) {

        Nota[] notas = {
                new Nota("andre", 4),
                new Nota("mariana", 5),
                new Nota("carlos", 8.5),
                new Nota("paulo", 9),
                new Nota("jonas", 3),
                new Nota("juliana", 6.7),
                new Nota("guilherme", 7),
                new Nota("lucia", 9.3),
                new Nota("ana", 10)
        };

        Nota[] rank = intercala(notas, 0, 4, notas.length);

        for(Nota nota : rank) {
            System.out.println(nota.getValor());
        }

    }

    public static Nota[] intercala(Nota[] notas, int inicial, int miolo, int termino) {
        Nota[] resultado = new Nota[notas.length];

        int atual = 0;
        int atual01 = inicial;
        int atual02 = miolo;

        while(atual01 < miolo && atual02 < termino) {
            Nota nota01 = notas[atual01];
            Nota nota02 = notas[atual02];

            if(nota01.getValor() < nota02.getValor()) {
                resultado[atual] = nota01;
                atual01++;
            } else {
                resultado[atual] = nota02;
                atual02++;
            }
            atual++;
        }

        while(atual01 < miolo) {
            resultado[atual] = notas[atual01];
            atual01++;
            atual++;
        }
        while(atual02 < termino) {
            resultado[atual] = notas[atual02];
            atual02++;
            atual++;
        }

        return resultado;
    }

}
