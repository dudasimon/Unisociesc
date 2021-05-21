package VETORES;
import java.util.Scanner;
public class EXERCICIO04 {

	public static void main(String[] args) {
		// Faça um algoritmo que armazene 5 números. Após a leitura dos dados armazene na posição 3 do vetor o valor 100. Depois mostre todos os valores na tela 
		int numeros[] = new int[5];
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Informe na posicão " +(i+1)+ ", um número:");
			numeros[i] = entrada.nextInt();}
		
		entrada.close();
		
		numeros[2] = 100;
		
		for (int i = 0; i < numeros.length; i++) {
		System.out.println("Valores: " +numeros[i]);
		
	
		}
	}
}
