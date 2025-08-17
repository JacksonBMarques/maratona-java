package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    // Dado o valor de um carro descubra em quantas vezes ele pode ser parcelado
    // Condição valor da parcela >= 10000
    // teste branch
    public static void main(String[] args) {
        double valorCarro = 30000;


        for (int parcela = 1; parcela <= valorCarro ; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela >= 1000){
               System.out.println("Parcela "+ parcela+" R$ "+ valorParcela);
            }
            else{
                break;
            }
            }
        System.out.println(valorCarro);
        }


    }


