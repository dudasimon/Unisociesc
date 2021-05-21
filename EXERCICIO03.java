package VETORES;
import java.util.Scanner;
public class EXERCICIO03 {

	public static void main(String[] args) {
		// Faça um código que recebe o nome e a média de 5 alunos. Ao final apresente a média da classe e o nome dos alunos acima da média calculada.
		String [] nome = new String[5];
		double[] nota = new double[5];
		double soma = 0;
		double media = 0;
		double maior = 0;
		
		Scanner entrada = new Scanner(System.in);
	
		for (int i=0; i<nome.length; i++){
		 System.out.println("Digite o nome n"+(i+1)+"º : ");
		    nome[i] = entrada.nextLine();
		 System.out.println("Digite a nota do nome n"+(i+1)+"º : ");
		 	nota[i] = entrada.nextDouble();
		 	entrada.nextLine();
		 	soma = soma + nota[i];}
		
		media = soma/5;
		 System.out.println("A média da classe é: " +media);
		
		 for(int i = 0; i < 5; ++i){
		  if(nota[i] > media){
		      maior = nota[i];
		     System.out.println("O aluno "+nome[i]+" possui média "+maior+", maior que a média "+media);
	
		  }
	}
	entrada.close();
}
	}
