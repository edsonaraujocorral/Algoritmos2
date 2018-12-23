package com.company;

public class Main {
    public static void main(String[] args) {
        Nota[] notasDoMauricio = {
                new Nota("andre", 4),
                new Nota("mariana", 5),
                new Nota("carlos", 8.5),
                new Nota("paulo", 9)
        };

        Nota[] notasDoAlberto = {
                new Nota("jonas", 3),
                new Nota("juliana", 6.7),
                new Nota("guilherme", 7),
                new Nota("lucia", 8.5),
                new Nota("ana", 10)
        };

        Nota[] rank = intercala(notasDoMauricio, notasDoAlberto);

        for(Nota nota : rank) {
            System.out.println(nota.getAluno());
        }
    }

    private static Nota[] intercala(Nota[] notas01, Nota[] notas02) {
        int total = notas01.length + notas02.length;
        Nota[] resultado = new Nota[total];

        int atual01 = 0;
        int atual02 = 0;
        int atual = 0;

        while(atual01 < notas01.length && atual02 < notas02.length) {

            Nota nota01 = notas01[atual01];
            Nota nota02 = notas02[atual02];

            if(nota01.getValor() < nota02.getValor()) {
                resultado[atual] = nota01;
                atual01++;

            } else {
                resultado[atual] = nota02;
                atual02++;

            }
            atual++;
        }
        while(atual01 < notas01.length) {
            resultado[atual] = notas01[atual01];
            atual01++;
            atual++;
        }
        while(atual02 < notas02.length) {
            resultado[atual] = notas02[atual02];
            atual02++;
            atual++;
        }
        return resultado;
    }
}
