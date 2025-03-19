public class ProgramaInteiros {
    public static void main(String[] args) {
        ListaLigada<Integer> lista = new ListaLigada<Integer>();

        lista.adicionar(1);
        lista.adicionar(3);
        lista.adicionar(5);
        lista.adicionar(7);

        System.out.println("Tamanho: " + lista.getTamanho());
        for(int i=0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }
    }

}
