package VETORES;
import java.util.Scanner;
public class FILA {
	
	public static String input() {
	Scanner teclado = new Scanner(System.in);
	String input = teclado.nextLine();
	
	return input;
	};
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nome[], descricao[];
		int idade[] = new int[20];
		nome = new String[20];
		descricao = new String[20];
		int menu;
		int i;
		
		int qntPessoa = 0;
		for(i=0; i<21; i++) {
			System.out.println("\nCapacidade máxima  de pessoas na fila: 20. Quantidade atual: "+qntPessoa);
			if (qntPessoa == 20) {
				System.out.println("\nCapacidade limite alcançada, impossibilitado de inserir novo paciente:\n\n2- Atender paciente\n 3- Sair\n\n");
				menu = Integer.parseInt(teclado.next());
				} else {
				System.out.println("\nEscolha uma das opções:\n\n1- Incluir Paciente\n2- Atender Paciente\n3- Sair\n\nOpção Desejada: ");
				menu = Integer.parseInt(teclado.next()); 
					
				}
		
		if (menu == 1) {
			System.out.println("\nPara incluir novos pacientes, preencha as informações:\n");
			System.out.println("Nome: ");
			nome[i] = input();
			System.out.println("Idade: ");
			idade[i] = Integer.parseInt(teclado.next());
			System.out.println("Breve descrição do atendimento: ");
			descricao[i] = input();
			qntPessoa = qntPessoa + 1;
			
			} else if (menu == 2) {
				if (qntPessoa == 0) {
					System.out.println("\nNão há mais pessoas para serem atendidas");
					break;
			} else {
				nome [i] = input();
				idade[i] = Integer.parseInt(teclado.next());
				descricao[i] = input();
				int contador = 0;
				System.out.println("\nFilas reorganizadas");
				for (i=0; i<(nome.length - 1); i++) {
					contador = contador + 1;
					nome[0] = nome[contador];
					idade[0] = idade[contador];
					descricao[0] = descricao[contador];
					System.out.println("\n\nNome:\n" +nome[contador]);
					System.out.println("\n\nIdade:\n" +idade[contador]);
					System.out.println("\n\nDescrição:\n" +descricao[contador]);}
				
				i = i - 1;
				qntPessoa = qntPessoa - 1;}
				
			} else {
				System.out.println("Saindo...");
				break;
			}
	}		
	
}
}
