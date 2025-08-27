package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoaTest03 {
    public static void main(String[] args) {
         Calculadora calculadora = new Calculadora();
         double resultado = calculadora.divideDoisNumeros(10,3);
         System.out.println(resultado);
    }
}
