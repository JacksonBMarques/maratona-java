package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // padrões de inicialização
        //byte, short, int, long, float e double = 0
        // char '\u0000' = ' '
        // boolean = false
        // String null

        int[] inteiro = new int[3];
        System.out.println(inteiro[0]);
        System.out.println(inteiro[1]);
        System.out.println(inteiro[2]);

        char[] caractere = new char[3];
        System.out.println(caractere[0]);
        System.out.println(caractere[1]);
        System.out.println(caractere[2]);

        boolean[] booleano = new boolean[3];
        System.out.println(booleano[0]);
        System.out.println(booleano[1]);
        System.out.println(booleano[2]);

        String[] texto = new String[3];
        System.out.println(texto[0]);
        System.out.println(texto[1]);
        System.out.println(texto[2]);
    }
}
