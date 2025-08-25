package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Luffy";
        estudante.idade = 18;
        estudante.sexo = 'M';

        Estudante sasuke = new Estudante();
        sasuke.nome = "naruto";
        sasuke.idade = 18;
        sasuke.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println("==================");
        System.out.println(sasuke.nome);
        System.out.println(sasuke.idade);
        System.out.println(sasuke.sexo);

    }
}
