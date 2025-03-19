public class ProgramaClientes {
    public static void main(String[] args) {
        ListaLigada<Cliente> cliente = new ListaLigada<Cliente>();

        cliente.adicionar(new Cliente("Thasyo", 22));
        cliente.adicionar(new Cliente("Luana", 22));

        System.out.println("Tamanho: " + cliente.getTamanho());
        for(int i=0; i < cliente.getTamanho(); i++){
            System.out.println(cliente.get(i).getValor());
        }
    }
}
