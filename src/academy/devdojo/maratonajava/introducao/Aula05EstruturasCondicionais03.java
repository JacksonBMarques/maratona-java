package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 20;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Eu não vou doar";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        // operador ternario

        System.out.println(resultado);
    }

}
