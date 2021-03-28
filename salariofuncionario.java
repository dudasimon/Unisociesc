package sequenciais;
import java.util.Scanner;
public class salariofuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaração das variáveis.
		
				String nome; 
		  		int numeroHoras;
		  		int dependentes;
		  		
			  	//Entradas de dados
		  		Scanner teclado = new Scanner(System.in);
		  		
		  		System.out.println("Nome:");
		  		nome = teclado.next();

		  		System.out.println("Horas:");
		  		numeroHoras = teclado.nextInt();
		  		
		  		System.out.println("Dependentes:");
		  		dependentes = teclado.nextInt();  
		  		
		  		//Processamento
		  		double salarioBruto = numeroHoras * 32 + dependentes * 40;
		   	    double valorINSS = salarioBruto * 8.5 / 100;
		   	    double valorIR = salarioBruto * 5 / 100;
		   	    double salarioLiquido = salarioBruto - valorINSS - valorIR;  	
		   	    
		 	  	//Saída
		   	    System.out.println("Nome:" + nome);
		  		System.out.println("Bruto:" + salarioBruto);
		  		System.out.println("INSS:" + valorINSS);
		  		System.out.println("IR:" + valorIR);
		  		System.out.println("Liquido:" + salarioLiquido);
		  		
		   		teclado.close();
	}

}
