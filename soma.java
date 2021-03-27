package sequenciais;
import java.util.Scanner;
public class soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaração das variáveis
		int N1;
		int N2;
		int soma;
	
	//Início
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		N1 = teclado.nextInt();
		
		System.out.println("Digite o segundo número: ");
		N2 = teclado.nextInt();
		
	//Processamento
		soma = N1 + N2;
		
	//Fim
		System.out.println("O resultado da soma é " + soma);
		
teclado.close();
	}

}
