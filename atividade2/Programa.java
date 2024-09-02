package Exercicio6;

import javax.swing.JOptionPane;

public class Programa {

    public static void main(String[] args) {

        Double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Escreva o primeiro número abaixo: "));
        String operacao = JOptionPane.showInputDialog(null, "Escreva agora o sinal da operacao: ");
        Double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Por fim, escreva o segundo número abaixo: "));

        Calculadora calc = new Calculadora(num1, operacao, num2);
        calc.calculo();
    }
}
