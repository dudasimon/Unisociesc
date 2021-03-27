package sequenciais;
import java.util.Scanner;
public class subtracao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaração das variáveis
			int N1;
			int N2;
			int subtracao;
		
		//Início
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Digite o primeiro número: ");
			N1 = teclado.nextInt();
			
			System.out.println("Digite o segundo número: ");
			N2 = teclado.nextInt();
			
		//Processamento
			subtracao = N1 - N2;
			
		//Fim
			System.out.println("O resultado da subtração é " + subtracao);
			
teclado.close();
	}
			
	}
