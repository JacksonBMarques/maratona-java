package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    //0- Bloco de inicialização é executado na classe
    //1- alocado espaço de memoria do objeto
    //2- atributo é criado com valor default
    //3- bloco de inicialização
    //4-construtor é executado
    static {
        System.out.println("dentro do bloco");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i]= i+1;

        }

    }


    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime(){

        for (int episodio: Anime.episodios){
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}

