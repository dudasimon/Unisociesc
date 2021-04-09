package sequenciais;
import java.util.Scanner;
public class cargos_aumento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		double sal, novosal, aumento;
		String nomefunc;
	
	Scanner teclado = new Scanner(System.in);
	
		System.out.println("Informe o nome do funcionário: ");
		nomefunc = teclado.next();
	
		System.out.println("Informe o salário do funcionário" + nomefunc +":");
		sal = teclado.nextDouble();
	
	System.out.println("Digite o número correspondente ao seu cargo\n"
			+ "1 - Escrituário\n"
			+ "2 - Secretário\n"
			+ "3 - Caixa\n"
			+ "4 - Gerente\n"
			+ "5 - Diretor");
	n = teclado.nextInt();
	
	switch (n)
	{
		case 1:
			aumento = sal * 0.50;
			novosal = sal + aumento;
			System.out.println("O funcionário " + nomefunc + ", do cargo Escrituário\n"
                    + "Recebe aumento no salário de 50% = R$" + aumento + "\n"
                            + "Do salário atual: R$" + sal + ", é feito um reajuste para: R$" + novosal);
        break;
		
		
		case 2:
			aumento = sal * 0.35;
			novosal  = sal + aumento;
			System.out.println("O funcionário " + nomefunc + ", do cargo Secretário\n"
                    + "Recebe aumento no salário de 35% = R$" + aumento + "\n"
                            + "Do salário atual: R$" + sal + ", é feito um reajuste para: R$" + novosal);
			break;
		
		case 3:
			aumento = sal * 0.20;
			novosal = sal + aumento;
			System.out.println("O funcionário " + nomefunc + ", do cargo Caixa\n"
                    + "Recebe aumento no salário de 20% = R$" + aumento + "\n"
                            + "Do salário atual: R$" + sal + ", é feito um reajuste para: R$" + novosal);
			break;
			
		case 4:
			aumento = sal * 0.10;
			novosal = sal + aumento;
			System.out.println("O funcionário " + nomefunc + ", do cargo Gerente\n"
                    + "Recebe aumento no salário de 10% = R$" + aumento + "\n"
                            + "Do salário atual: R$" + sal + ", é feito um reajuste para: R$" + novosal);
			break;
	
		case 5:
			System.out.println("O cargo de Diretor não recebe algum tipo de aumento, seu salário é de: R$" + sal +"");
			
		default: System.out.println("Número digitado inválido!");
		
				
	}
	
teclado.close();
		}
	
	}
