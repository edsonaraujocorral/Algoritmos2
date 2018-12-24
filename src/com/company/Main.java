package com.company;

public class Main {
    public static void main(String[] args) {

        Nota[] notas = {
                new Nota("andre", 4),   //0
                new Nota("lucia", 9.3), //1
                new Nota("paulo", 9),   //2
                new Nota("mariana", 5), //3
                new Nota("carlos", 8.5),//4
                new Nota("jonas", 3),   //5
                new Nota("guilherme", 7),//6
                new Nota("juliana", 6.7),//7
                new Nota("ana", 10)      //8
        };
        ordena(notas, 0, notas.length);
        for(Nota nota : notas) {
            System.out.println(nota.getValor());
        }

    }

    private static void ordena(Nota[] notas, int inicial, int termino) {
        int quantidade = termino - inicial;
        if(quantidade > 1) {
            int meio = (inicial + termino) / 2;
            ordena(notas, inicial, meio);
            ordena(notas, meio, termino);
            intercala(notas, inicial, meio, termino);
        }
    }

    public static void intercala(Nota[] notas, int inicial, int miolo, int termino) {
        Nota[] resultado = new Nota[notas.length - inicial];

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

        for(int i = 0; i < atual; i++) {
            notas[inicial + i] = resultado[i];
        }

    }

}
