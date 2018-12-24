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
                guilherme,
                new Nota("juliana", 6.7),
                new Nota("ana", 10)
        };

        int quantidadeDeMenores = encontraMenores(guilherme, notas);
        System.out.println("Numeros de Menores: " + quantidadeDeMenores);
    }

    private static int encontraMenores(Nota guilherme, Nota[] notas) {
        int menores = 0;
        for(int atual = 0; atual < notas.length; atual++) {
            Nota nota = notas[atual];
            if(nota.getValor() < guilherme.getValor()) {
               menores++;
            }
        }

        return menores;
    }
}
