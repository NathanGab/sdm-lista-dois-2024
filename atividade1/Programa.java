import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IMC imc = new IMC();
        String opcao;

        do {
            System.out.print("Digite o peso em kg: ");
            double peso = scanner.nextDouble();

            System.out.print("Digite a altura em metros: ");
            double altura = scanner.nextDouble();

            double resultadoIMC = imc.calcularIMC(peso, altura);
            String interpretacao = imc.interpretarIMC(resultadoIMC);

            System.out.printf("Seu IMC é: %.2f - %s%n", resultadoIMC, interpretacao);

            System.out.print("Deseja calcular o IMC novamente? (sim/nao): ");
            opcao = scanner.next();

        } while (opcao.equalsIgnoreCase("sim"));

        scanner.close();
    }
}
