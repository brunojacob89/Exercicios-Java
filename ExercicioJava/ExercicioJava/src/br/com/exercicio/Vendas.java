package br.com.exercicio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Vendas {

	public static void main(String[] args) {
		// variaveis
		double total,desconto, totalDesconto, valorPago, troco;
		
		// objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		
		//entrada 1
		System.out.println("Vendas");
		System.out.print("Total da Venda: ");
		total = teclado.nextDouble();
		System.out.print("Desconto(%): ");
		desconto= teclado.nextDouble();
		
		//Processamento
		totalDesconto = total - (desconto * total) / 100;
		
		//saida 1
		System.out.println("Total com desconto:R$ " + formatador.format(totalDesconto));
		
		//entrada2
		System.out.println("_______________________________________________________");
		System.out.print("Valor Pago em Dinheiro: ");
		valorPago = teclado.nextDouble();
		
		//Processamento 2
		troco = valorPago - totalDesconto;
		
		//saida2
		System.out.println("Troco:R$ " + formatador.format(troco));
		teclado.close();
		
	}

}
