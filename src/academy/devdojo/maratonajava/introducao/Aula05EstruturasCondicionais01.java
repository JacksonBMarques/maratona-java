package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 17;

        if(idade < 15) {
            System.out.println("infantil");
        }
        if(idade >= 15 && idade <18) {
            System.out.println("juvenil");
        }
        if(idade >= 18) {
            System.out.println("adulto");
        }

    }

}
