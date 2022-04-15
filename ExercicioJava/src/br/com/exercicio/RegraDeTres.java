package br.com.exercicio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RegraDeTres {

	public static void main(String[] args) {
		
		// y --- 100%
		// valor--x%
		// valor.100 = x.y
		// valor = (x.y) / 100

		// variaveis
		double x, y, valor;
		// objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");

		// entrada
		System.out.println("Regra de Três");
		System.out.println("x% de y = valor");
		System.out.print("Digite o valor de X = ");
		x = teclado.nextDouble();
		System.out.print("Digite o valor de y =");
		y = teclado.nextDouble();

		// processamento
		valor = (x * y) / 100;

		// saida
		System.out.println(x + "% de " + y + " = " + formatador.format(valor));

		teclado.close();
	}

}
