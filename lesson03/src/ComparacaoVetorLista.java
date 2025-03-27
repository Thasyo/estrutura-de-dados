import java.util.ArrayList;

public class ComparacaoVetorLista {
    public static void main(String[] args) {
        ListaLigada<Integer> lista = new ListaLigada<Integer>();
        ArrayList<Integer> vetor = new ArrayList<Integer>();

        // Adicionando Elementos
        int limite = 10000;
        long tempoInicial = System.currentTimeMillis();
        long tempoFinal;

        //vetor
        for (int i = 0; i < limite; i++){
            vetor.add(i);
        }
        tempoFinal = System.currentTimeMillis();

        System.out.print("Tempo de adição de elementos no vetor: ");
        System.out.println(tempoFinal - tempoInicial);

        //lista
        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < limite; i++){
            lista.adicionar(i);
        }
        tempoFinal = System.currentTimeMillis();

        System.out.print("Tempo de adição de elementos na lista: ");
        System.out.println(tempoFinal - tempoInicial);

        //Acessando elementos

        //vetor
        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < vetor.size(); i++){
            vetor.get(i);
        }
        tempoFinal = System.currentTimeMillis();

        System.out.print("Tempo de acesso aos elementos no vetor: ");
        System.out.println(tempoFinal - tempoInicial);

        //lista
        tempoInicial = System.currentTimeMillis();
        IteratorListaLigada<Integer> iterator = lista.getIterator();
        while(iterator.temProximo()){
            iterator.getProximo();
        }
        tempoFinal = System.currentTimeMillis();

        System.out.print("Tempo de acesso aos elementos na lista: ");
        System.out.println(tempoFinal - tempoInicial);
    }
}
