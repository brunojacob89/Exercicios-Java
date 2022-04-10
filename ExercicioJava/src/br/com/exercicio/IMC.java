package br.com.exercicio;
import java.text.DecimalFormat;
import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {

		double peso, altura, imc;

		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");

		System.out.println("Calculo do IMC");
		System.out.print("Digite seu peso: ");
		peso = teclado.nextDouble();
		System.out.print("Digite sua altura: ");
		altura = teclado.nextDouble();

		imc = peso / (altura * altura);
		System.out.println("Seu IMC é " + formatador.format(imc));
		teclado.close();

		if (imc < 18.5) {
			System.out.println("Abaixo do peso!");
		} else if (imc < 25) {
			System.out.println("Peso Ideal!");
		} else if (imc < 30) {
			System.out.println("Levemente Acima do Peso!");
		} else if (imc < 35) {
			System.out.println("Obesidade Grau I");
		} else if (imc < 40) {
			System.out.println("Obesidade Grau II (severa)!");
		} else {
			System.out.println("Obesidade Grau III (Mórbida)!");
		}

	}

}
