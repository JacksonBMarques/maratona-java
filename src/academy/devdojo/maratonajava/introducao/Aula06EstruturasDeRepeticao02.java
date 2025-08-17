package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os numeros pares até 1000000
        int count = 0;
        while (count <= 1000000) {

            if (count % 2 == 0) {
                System.out.println(count);

            }
            count++;
        }

    }

}
