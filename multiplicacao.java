package sequenciais;
import java.util.Scanner;
public class multiplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaração das variáveis
			int N1;
			int N2;
			int multiplicacao;
			
		//Início
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Digite o primeiro número: ");
			N1 = teclado.nextInt();
			
			System.out.println("Digite o segundo número: ");
			N2 = teclado.nextInt();
			
		//Processamento
			multiplicacao = N1 * N2;
		
		//Fim
			System.out.println("O resultado da multipliação é: " + multiplicacao);
			
teclado.close();

					
				
					
					
			
	}

}
