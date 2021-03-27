package sequenciais;
import java.util.Scanner;
public class areatriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaração das variáveis.
  		int base; 
  		int altura;
  		int area;
  		
	  	//Entradas de dados
  		Scanner teclado = new Scanner(System.in);
  		
  		System.out.println("Base:");
  		base = teclado.nextInt();

  		System.out.println("Altura:");
  		altura = teclado.nextInt();

  		area = base * altura / 2;
  		
	  	//Processamento e Saída
 		System.out.println("Area:" + area);
 		
 		teclado.close();
	}

}
