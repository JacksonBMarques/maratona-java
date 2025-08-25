package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        // Um array é uma estrutura de dados que define uma referencia a um espaço de memória
        // deve ser usado para facilitar a criação de listas, no exemplo abaixo temos um arrat listando idades
        // na pratica as tres idades declaradas ocupam o mesmo local na memoria diferenciados pelo indice [1]
        int[] idades = new int[3];
        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 11;
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
    }
}
