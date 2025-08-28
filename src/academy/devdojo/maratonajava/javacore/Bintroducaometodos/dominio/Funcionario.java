package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;


    public void imprime (){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salario == null){
            return;
        }else {
            for (int i = 0; i < salario.length ; i++) {
                 System.out.println("salario " + i + ": " + salario[i]);
            }
        }
    }

    public void mediaSalario(){
        double media = 0;
        for (int i =0; i< salario.length; i++) {
            media = media + salario[i];
        }
        media = media / salario.length;
        System.out.println(media);
    }


}
