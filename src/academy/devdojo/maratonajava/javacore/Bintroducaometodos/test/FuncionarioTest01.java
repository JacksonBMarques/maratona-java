package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "breno";
        funcionario.idade = 15;
        funcionario.salario = new double[]{1000,2000,3000};

        funcionario.imprime();
        funcionario.mediaSalario();
    }
}
