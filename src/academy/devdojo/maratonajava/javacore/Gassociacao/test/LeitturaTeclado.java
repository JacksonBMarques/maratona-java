package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeitturaTeclado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" EU sou o GRANDE VIDENTE");
        System.out.println(" Digite sua pergunta eu responderei com SIM OU NÃo");
        String  pergunta = input.nextLine();
        if(pergunta.charAt(0) ==' '){
            System.out.println("sim");
        }else{
            System.out.println("não");
        }
    }
}
