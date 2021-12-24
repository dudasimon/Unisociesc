package Calculadora;

import java.util.Scanner;

public class DecimalParaHexa {

	public DecimalParaHexa() {

		Scanner sc = new Scanner(System.in);

		int decimal, reminder;
		char[] hexa = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		String hexaValor = "";

		System.out.println("Digite um número: ");
		decimal = sc.nextInt();

		while (decimal > 0) {
			reminder = decimal % 16;
			hexaValor = hexa[reminder] + hexaValor;
			decimal = decimal / 16;

		}
		System.out.println("Valor hexadecimal é: " + hexaValor);
	}

	public static void main(String[] args) {

		DecimalParaHexa obj = new DecimalParaHexa();

	}

}
