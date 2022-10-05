package estruturasDeDados.listas.estaticas;

public class ListaEstatica implements ListaTAD{
    private int quantidade;
    private int capacidade;
    private int[] elementos;

    public ListaEstatica(int capacidade){
        if(capacidade<10){
            elementos = new int[10];
            this.capacidade = 10;
        }else{
            elementos = new int[capacidade];
            this.capacidade = capacidade;
        }
    }

    @Override
    public void add(int e) {
        if(quantidade == capacidade){
            int[] novaArray = new int[capacidade*2];
            for(int i = 0; i<quantidade; i++){
                novaArray[i] = elementos[i];
            }
            elementos = novaArray;
        }
        elementos[quantidade] = e;
        quantidade++;
    }

    @Override
    public void add(int index, int element) {

    }

    @Override
    public int get(int index) {
        return 0;
    }

    @Override
    public int set(int index, int element) {
        return 0;
    }

    @Override
    public boolean remove(int e) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean contains(int e) {
        return false;
    }

    @Override
    public int indexOf(int e) {
        return 0;
    }

    @Override
    public void clear() {

    }
}
