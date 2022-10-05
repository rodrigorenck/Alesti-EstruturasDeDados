package estruturasDeDados.filas;

public class TestaFilaNodo {
    public static void main(String[] args) {
        FilaNodo pilha = new FilaNodo();

        pilha.adicionar(10);
        pilha.adicionar(20);
        pilha.adicionar(30);
        pilha.adicionar(40);

        System.out.println(pilha);

        int remover = pilha.remover();

        System.out.println(remover);

        System.out.println(pilha);
    }
}
