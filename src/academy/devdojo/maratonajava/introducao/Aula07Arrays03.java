package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";
        //For deve ser usado para imprimir arrays baseados no indice
        // Um array não aumenta de tamanho dinamicamente, todas as vezes precisa compilar e alterar em todos os locais
        for (int i = 0; i < 3; i++) {
            System.out.println(nomes[i]);

        }
        // nomes.lenght você conta o tamanho do array
        //Quando voçê muda a definição do array no meio do código, a definição anterior é perdida.
        nomes = new String[6];
        nomes[3] = "sasuke";
        nomes[4] = "naruto";
        nomes[5] = "kakashi";
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);

        }
    }
}
