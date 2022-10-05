package estruturasDeDados.pilhas;

public interface PilhaTAD {

    void adicionar(int e);
    int remover();
    int topo();
    int tamanho();
    boolean estaVazio();
    void limpar();
}
