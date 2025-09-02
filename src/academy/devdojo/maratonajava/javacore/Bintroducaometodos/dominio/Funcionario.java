package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double media;



    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public double getMedia() {
        return media;
    }

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

        for (int i =0; i< salario.length; i++) {
            media = media + salario[i];
        }
        media = media / salario.length;
        System.out.println(media);
    }
}
