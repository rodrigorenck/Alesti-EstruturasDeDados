package estruturasDeDados.filas;

public interface FilaTAD {
    void adicionar(int e);
    int remover();
    int topo();
    int tamanho();
    boolean estaVazio();
    void limpar();
}
