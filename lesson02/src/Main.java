import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // VETORES DE STRING (PARTE 02)
        String[] estados = new String[10];
        estados[0] = "AC";
        estados[1] = "BA";
        estados[2] = "CE";
        estados[3] = "DF";
        estados[4] = "AM";
        estados[5] = "AP";
        estados[6] = "PB";
        estados[7] = "RN";
        estados[8] = "MS";
        estados[9] = "SP";

        for (int i = 0; i < estados.length; i++) {
            System.out.println("Estado " + i + ": " + estados[i]);
        }

        // Fazendo busca no vetor.
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual sigla de estado você quer buscar: ");
        String siglaBuscada = sc.nextLine();
        String sigla = siglaBuscada.toUpperCase();

        // Busca Linear
        // Nesse tipo de busca, basicamente o vetor vai ser percorrido sequencialmente até encontrar o elemento.
        // Esse tipo de busca não é recomendada, pois degasta muito a memória e não é tão efetiva.
        boolean encontrou = false;
        for (int i = 0; i < estados.length; i++) {
            if(sigla.equals(estados[i])){
                encontrou = true;
                break;
            }
        }

        if(encontrou){
            System.out.println("Sigla encontrada!");
        }else{
            System.out.println("Sigla NÃO encontrada!");
        }

    }
}