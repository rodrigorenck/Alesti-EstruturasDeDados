package estruturasDeDados.pilhas;

public class CalculadoraDePilha {
    private PilhaArray pilhaArray;

    public CalculadoraDePilha() {
        pilhaArray = new PilhaArray(10);
    }

    public int calcular(String expressao) {
        //elementos pode ser tanto um valor quanto um operador
        String[] elementos = expressao.split(" ");
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i].equals("+")) {
                int ultimo = pilhaArray.remover();
                int penultimo = pilhaArray.remover();
                int resultado = ultimo + penultimo;
                pilhaArray.adicionar(resultado);
            } else if (elementos[i].equals("-")) {
                int ultimo = pilhaArray.remover();
                int penultimo = pilhaArray.remover();
                int resultado = ultimo - penultimo;
                pilhaArray.adicionar(resultado);
            } else if (elementos[i].equals("/")) {
                int ultimo = pilhaArray.remover();
                int penultimo = pilhaArray.remover();
                int resultado = ultimo / penultimo;
                pilhaArray.adicionar(resultado);

            } else if (elementos[i].equals("*")) {
                int ultimo = pilhaArray.remover();
                int penultimo = pilhaArray.remover();
                int resultado = ultimo * penultimo;
                pilhaArray.adicionar(resultado);
            } else {
                pilhaArray.adicionar(Integer.parseInt(elementos[i]));
            }
        }
        return pilhaArray.remover();
    }
}
