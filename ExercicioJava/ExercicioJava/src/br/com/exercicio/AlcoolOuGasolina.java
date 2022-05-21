package br.com.exercicio;


import java.util.Scanner;

public class AlcoolOuGasolina {

	public static void main(String[] args) {
		// variaveis	
		double alcool , gasolina;
		
		//objetos
		Scanner teclado = new Scanner(System.in);
		
		
		// entrada
		System.out.println("Alcool x Gasolina");
		System.out.print("Digite o valor do alcool: ");
		alcool = teclado.nextDouble();
		System.out.print("Digite o valor da Gasolina: ");
		gasolina = teclado.nextDouble();
		
		//processamento e saida(digitado ifel auto complete)
		if (alcool < 0.7 * gasolina) {
			System.out.println(" Abstecer com Alcool! ");
		} else {
			System.out.println(" Abastecer com Gasolina! ");
		}
		teclado.close();
	}

}
