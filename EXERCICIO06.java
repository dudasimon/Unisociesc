package VETORES;
import java.util.Scanner;
public class EXERCICIO06 {

	public static void main(String[] args) {
		//Faça um algoritmo que leia 10 valores e ao final imprima quantos desses são pares e quantos são ímpares.
		
		int iContadorPar = 0;
		int iContadorImpar = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		int valores[] = new int[10];
		
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Informe o " +(i+1)+ "º valor");
			valores[i] = entrada.nextInt();
			
			if (valores[i] % 2 == 0) {
				++iContadorPar;
				continue;}
			
		++iContadorImpar;}
			
		System.out.println("Quantidade de números Par: " +iContadorPar);
		System.out.println("Quantidade de números Ímpar: " +iContadorImpar);
	
		entrada.close();
	}

}


