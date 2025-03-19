public class Elemento<TIPO> {
    private TIPO valor;
    private Elemento<TIPO> proximo;

    public Elemento(TIPO novoValor){
        this.valor = novoValor;
    }

    public Elemento<TIPO> getProximo() {
        return proximo;
    }

    public void setProximo(Elemento<TIPO> proximo) {
        this.proximo = proximo;
    }

    public TIPO getValor() {
        return valor;
    }

    public void setValor(TIPO valor) {
        this.valor = valor;
    }
}
