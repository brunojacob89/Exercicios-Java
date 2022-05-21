package br.com.exercicio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class conversor {

	public static void main(String[] args) {

		// variaveis
		double c,f;
		
		// objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.0");
		//entrada
		System.out.println("Conversão de Temperatura");
		System.out.print("Digite a temperatura em Fahrenheit: ");
		f = teclado.nextDouble();
		//processamento
		c = (5*(f-32))/9;
		//saida
		System.out.println("A temperatura em Celsius é: " + formatador.format(c)+ "°C");
		
		teclado.close();
	}

}
