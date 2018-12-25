package com.company;

public class Main {
    public static void main(String[] args) {
        Nota guilherme = new Nota("guilherme", 7);
        Nota[] notas = {
                new Nota("andre", 4),
                new Nota("lucia", 9.3),
                new Nota("paulo", 9),
                new Nota("mariana", 5),
                new Nota("carlos", 8.5),
                new Nota("jonas", 3),
                new Nota("ana", 10),
                new Nota("juliana", 6.7),
                guilherme
        };
        quebraNoPivo(notas, 0, notas.length);

        for(int i = 0; i < notas.length; i++) {
            Nota nota = notas[i];
            System.out.println(nota.getAluno() + " " + nota.getValor());
        }

    }
    private static void quebraNoPivo(Nota[] notas, int inicial, int termino) {
        int menoresEncontrados = 0;
        Nota pivo = notas[termino - 1];
        for(int analisando = 0; analisando < termino - 1; analisando++) {
            Nota atual = notas[analisando];
            if(atual.getValor() <= pivo.getValor()) {
                troca(notas, analisando, menoresEncontrados);
                menoresEncontrados++;
            }
        }

        troca(notas, termino - 1, menoresEncontrados);


    }

    private static void troca(Nota[] notas, int de, int para) {
        Nota nota1 = notas[de];
        Nota nota2 = notas[para];

        notas[de] = nota2;
        notas[para] = nota1;
    }
}
