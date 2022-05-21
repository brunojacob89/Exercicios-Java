package br.com.exercicio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValorServico {
	// Imposto de 30%
	// Investimento 20%
	public static void main(String[] args) {
		// variaveis
		double hora, remuneracao, custo, cargaHoraria;

		// objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		
		//entrada
		System.out.println("Calculo do valor da hora de um serviço!");
		System.out.print("Remuneração Mensal Pretendida: ");
		remuneracao = teclado.nextDouble();
		System.out.print("Custo Operacional Mensal: ");
		custo = teclado.nextDouble();
		System.out.print("Carga Horaria Mensal: ");
		cargaHoraria = teclado.nextDouble();
		
		//processamento
		hora = (remuneracao + (remuneracao * 0.3) + custo + (remuneracao * 0.2)) / cargaHoraria;
		
		//saida
		System.out.println("Valor da hora: " + formatador.format(hora));
		teclado.close();
	}

}
