public class IteratorListaLigada<TIPO> {
    private Elemento<TIPO> elemento;

    public IteratorListaLigada(Elemento<TIPO> elemento){
        this.elemento = elemento;
    }

    public Elemento<TIPO> getElemento() {
        return elemento;
    }

    public void setElemento(Elemento<TIPO> elemento) {
        this.elemento = elemento;
    }

    public boolean temProximo(){
        if(elemento.getProximo() == null){
            return false;
        }else{
            return true;
        }
    }

    public Elemento<TIPO> getProximo(){
        elemento = elemento.getProximo();
        return elemento;
    }
}
