package estruturasDeDados.filas;
import estruturasDeDados.Nodo;

public class FilaNodo implements FilaTAD {
    private Nodo inicio;
    private Nodo fim;
    private int quantidade;

    public FilaNodo(){
        inicio = null;
        fim = null;
        quantidade = 0;
    }


    @Override
    public void adicionar(int e) {
        Nodo novoNodo = new Nodo(e);
        if(quantidade==0){
            inicio = novoNodo;
            fim = novoNodo;
            quantidade++;
        }else{
            Nodo fimAntigo = fim;
            fimAntigo.proximo = novoNodo;
            fim = novoNodo;
            quantidade++;
        }
    }

    //first in first out
    @Override
    public int remover() {
        if(inicio != null){
            Nodo inicioAntigo = inicio;
            Nodo novoInicio = inicioAntigo.proximo;
            inicio = novoInicio;
            quantidade--;
            return inicioAntigo.elemento;
        }
        return 0;
    }

    //primeiro a sair
    @Override
    public int topo() {
        return inicio.elemento;
    }

    @Override
    public int tamanho() {
        return quantidade;
    }

    @Override
    public boolean estaVazio() {
        return quantidade==0;
    }

    @Override
    public void limpar() {
        inicio = null;
        fim = null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        if(inicio == null) return  sb.toString();
        Nodo aux = inicio;
        while(aux != fim.proximo){
            sb.append(aux.elemento + " ");
            aux = aux.proximo;
        }
        return  sb.toString();
    }
}
