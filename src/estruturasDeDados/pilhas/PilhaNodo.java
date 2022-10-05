package estruturasDeDados.pilhas;

import estruturasDeDados.Nodo;

public class PilhaNodo implements PilhaTAD {
    private Nodo inicio;
    private Nodo fim;
    private int quantidade;

    public PilhaNodo() {
        inicio = null;
        fim = null;
        quantidade = 0;
    }


    @Override
    public void adicionar(int e) {
        Nodo novoNodo = new Nodo(e);
        if (quantidade==0) {
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

    //last in first out
    @Override
    public int remover() {
        if(quantidade!=0){
            Nodo aux = inicio;
            while(aux.proximo != fim){
                aux = aux.proximo;
            }
            //aqui eu ja sei que estou no penultimo elemento
            int ultimoElemento = fim.elemento;
            fim = aux;
            aux.proximo = null;
            quantidade--;
            return ultimoElemento;
        }
        return 0;
    }

    @Override
    public int topo() {
        return fim.elemento;
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
        inicio =null;
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
