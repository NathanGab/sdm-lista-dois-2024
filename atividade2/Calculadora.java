package Exercicio6;
import javax.swing.JOptionPane;

public class Calculadora {

    private Double num1, num2;
    private String operacao;

    public Calculadora(Double num1, String operacao, Double num2) {

        this.num1 = num1;
        this.operacao = operacao;
        this.num2 = num2;

    }

    public void calculo() {
        Double divisao = num1 / num2;
        Double multiplicacao = num1 * num2;
        Double adicao = num1 + num2;
        Double subtracao = num1 - num2;

        
        String resultado = "/".equals(operacao) ? "O resultado da sua operação é " + divisao.toString() : "INVALIDO"; // Condição ? Ação
        resultado = "+".equals(operacao) ? adicao.toString() : resultado;
        resultado = "-".equals(operacao) ? subtracao.toString() : resultado;
        resultado = "*".equals(operacao) ? multiplicacao.toString() : resultado;

        JOptionPane.showMessageDialog(null, num1 + " " + operacao + " " + num2 + " = " + resultado);

    }

}
