package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;
pligoin
    public void imprime (){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (int i = 0; i < salario.length ; i++) {
            System.out.println("salario " + i + ": "+ salario[i]);

        }
    }

    public void mediaSalario(){
        double media = 0;
        for (double salario: salario) {
            media += salario;


        }
        media = media / salario.length;
        System.out.println(media);
    }


}
