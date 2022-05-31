package br.com.exercicio;

import java.util.Scanner;

public class JoKenPo {

	public static void main(String[] args) {
		int jogador, computador;
		Scanner teclado = new Scanner(System.in);
		System.out.println("_______JoKenPô_______");
		System.out.println(" ");
		System.out.println("1. Pedra");
		System.out.println("2. Papel");
		System.out.println("3. Tesoura");
		System.out.print("Digite a opção desejada: ");

		// lógica do jogador
		jogador = teclado.nextInt();
		System.out.println(" ");
		switch (jogador) {
		case 1:
			System.out.println("Jogador escolheu PEDRA!");
			break;
		case 2:
			System.out.println("Jogador escolheu PAPEL!");
			break;
		case 3:
			System.out.println("Jogador escolheu TESOURA!");
			break;
		default:
			System.out.println("Opção escolhida inválida");
			break;
		}

		// lógica do computador
		computador = (int) (Math.random() * 3 + 1);
		switch (computador) {
		case 1:
			System.out.println("Computador escolheu PEDRA!");
			break;
		case 2:
			System.out.println("Computador escolheu PAPEL!");
			break;
		case 3:
			System.out.println("Computador escolheu TESOURA!");
			break;
		}

		// lógica para determina o vencedor
		System.out.println(" ");
		if (jogador == computador) {
			System.out.println("Empate!");
		} else {
			if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1)
					|| (jogador == 3 && computador == 2)) {
				System.out.println("Jogador Venceu!!! ");

			} else {
				System.out.println("Computador Venceu!!!");
			}
		}

		teclado.close();

	}

}
