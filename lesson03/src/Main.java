public class Main {
    public static void main(String[] args) {
        //Lista Ligada ou Lista Encadeada
        ListaLigada<String> lista = new ListaLigada<String>();

        //Adicionando Elementos à Lista.
        lista.adicionar("AC");
        lista.adicionar("BA");
        lista.adicionar("CE");
        lista.adicionar("DF");
        System.out.println("TAMANHO: " + lista.getTamanho());
        System.out.println("PRIMEIRO: " + lista.getPrimeiro().getValor());
        System.out.println("ULTIMO: " + lista.getUltimo().getValor());

        //Pegando valores da lista pela posição.
        for(int i=0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }

        //Removendo elementos da lista.
        lista.remover("CE");
        lista.remover("AC");
        lista.remover("BA");
        lista.remover("DF");
        lista.adicionar("PARAÍBA MASCULINA");
        lista.adicionar("MULHER MACHO");
        lista.adicionar("SIM SINHÔ");
        lista.remover("PARAÍBA MASCULINA");
        lista.remover("SIM SINHÔ");
        System.out.println("Removendo elementos...");
        for(int i=0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }
        System.out.println("TAMANHO: " + lista.getTamanho());


    }
}