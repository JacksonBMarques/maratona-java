package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto","shonnen", 12);
        anime.init("Naruto","shonnen", 12, "ninjas");
        anime.imprime();

    }
}
