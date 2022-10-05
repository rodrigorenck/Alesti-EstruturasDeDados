package estruturasDeDados.pilhas;

public class TestaCalculadoraDePilha {

    public static void main(String[] args) {
        String expressao = "10 5 *";
        CalculadoraDePilha calc = new CalculadoraDePilha();
        int calcular = calc.calcular(expressao);
        System.out.println(calcular);
    }
}
