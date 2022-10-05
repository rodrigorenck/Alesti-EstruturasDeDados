package estruturasDeDados.pilhas;

public class TestaPilhaArray {

    public static void main(String[] args) {
        PilhaArray pilha = new PilhaArray(10);

        pilha.adicionar(100);
        pilha.adicionar(2);
        pilha.adicionar(41);
        pilha.adicionar(3);
        pilha.adicionar(5);


        System.out.println(pilha);

        int remover = pilha.remover();

        System.out.println(remover);
        System.out.println(pilha);
    }
}
