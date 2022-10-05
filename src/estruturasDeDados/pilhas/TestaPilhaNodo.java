package estruturasDeDados.pilhas;

public class TestaPilhaNodo {

    public static void main(String[] args) {

        PilhaNodo pilha = new PilhaNodo();

        pilha.adicionar(100);
        pilha.adicionar(400);
        pilha.adicionar(300);
        pilha.adicionar(200);

        System.out.println(pilha);

        int remover = pilha.remover();

        System.out.println(remover);

        System.out.println(pilha);
    }
}
