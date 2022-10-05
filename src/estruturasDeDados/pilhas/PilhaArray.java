package estruturasDeDados.pilhas;

public class PilhaArray implements PilhaTAD{
    private Integer[] elementos;
    private int topo;
    private int quantidade;
    private int capacidade;

    public PilhaArray(int capacidade){
        if(capacidade<10){
            elementos = new Integer[10];
            this.capacidade = 10;
        }else{
            elementos = new Integer[capacidade];
            this.capacidade = capacidade;
        }
    }

    @Override
    public void adicionar(int e) {
        if(quantidade == capacidade){
            throw new StackOverflowError("Pilha cheia");
        }
        elementos[quantidade] = e;
        quantidade++;
        topo = e;
    }

    @Override
    public int remover() {
        if(quantidade ==0){
            throw new RuntimeException("Erro, a pilha esta vazia");
        }
        Integer topo = elementos[quantidade - 1];
        elementos[quantidade-1] = 0;
        quantidade--;
        return topo;
    }

    @Override
    public int topo() {
        return elementos[quantidade-1];
    }

    @Override
    public int tamanho() {
        return quantidade;
    }

    @Override
    public boolean estaVazio() {
        return quantidade ==0;
    }

    @Override
    public void limpar() {
        for(int i = 0; i< quantidade; i++){
            elementos[i] = 0;
        }
        quantidade =0;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("");
        for(int i = 0; i< quantidade; i++){
            builder.append(elementos[i] + " ");
        }
        if(quantidade == 0) return "[]";
        return builder.toString();
    }
}
