package estruturasDeDados;

public class Nodo {
    public Nodo proximo;
    public int elemento;

    public Nodo(int elemento){
        this.elemento = elemento;
        proximo = null;
    }
}
