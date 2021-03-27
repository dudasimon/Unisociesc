package sequenciais;
import java.util.Scanner;
public class divisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaração das variáveis
		int dividendo;
		int divisor;
		double divisao;
		
	//Entradas
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o dividendo: ");
		dividendo = teclado.nextInt();
		
		System.out.println("Digite o divisor: ");
		divisor = teclado.nextInt();
		
	//Processamento
		divisao = dividendo / divisor;
		
//Saída
		System.out.println("A divisão é: " + divisao);
		
teclado.close();
	}

}
