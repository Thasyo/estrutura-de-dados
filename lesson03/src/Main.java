public class Main {
    public static void main(String[] args) {
        //Lista Ligada ou Lista Encadeada
        ListaLigada lista = new ListaLigada();

        //Adicionando Elementos à Lista.
        lista.adicionar("AC");
        lista.adicionar("BA");
        lista.adicionar("CE");
        lista.adicionar("DF");
        System.out.println("TAMANHO: " + lista.getTamanho());
        System.out.println("PRIMEIRO: " + lista.getPrimeiro().getValor());
        System.out.println("ULTIMO: " + lista.getUltimo().getValor());

        //Pegando valores da lista pela posição.
        System.out.println("Pegando Elemento na posição 1°: " + lista.get(0).getValor());
        System.out.println("Pegando Elemento na posição 2°: " + lista.get(1).getValor());
        System.out.println("Pegando Elemento na posição 3°: " + lista.get(2).getValor());
        System.out.println("Pegando Elemento na posição 4°: " + lista.get(3).getValor());
    }
}