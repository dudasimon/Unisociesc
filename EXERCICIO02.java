package VETORES;
import java.util.Scanner;
public class EXERCICIO02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Faça um algoritmo que receba o nome de 10 pessoas e imprima o nome das 10 pessoas em ordem inversa a que foi lida
		
		String[] nomes = new String[10];
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Informe na posição "+(i+1)+" um numero: ");
			nomes[i] = teclado.nextLine();
		}
		teclado.close();
				
		int i = 0;
		for (i = nomes.length-1; i >= 0; i--) {
			System.out.println("Resultado: "+nomes[i]);
		}
	}
}
