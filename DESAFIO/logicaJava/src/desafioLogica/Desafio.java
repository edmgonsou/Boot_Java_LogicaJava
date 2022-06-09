package desafioLogica;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double precoUnit, imposto, lucro, precoVenda, totalCama = 0, totalEletro = 0, totalVestu = 0;
		int quantidade, cont = 0, quantCama = 0, quantEletro = 0, quantVestu = 0;
		char categoria;
		
		while(cont < 15) {
			
			System.out.printf("\nDigite o pre�o unit�rio do %d� produto: \n", cont + 1);
			precoUnit = sc.nextDouble();
			System.out.printf("Digite a quantidade do %d� produto: \n", cont + 1);
			quantidade = sc.nextInt();
			System.out.printf("\nDigite a categoria %d� do produto:"
				+ "\n  C - cama.mesa e bannho."
				+ "\n  E - eletrodom�sticos."
				+ "\n  V - vestu�rio.\n", cont + 1);
			categoria = sc.next().charAt(0);
			categoria = Character.toUpperCase(categoria);
			
			while(categoria != 'C' && categoria != 'E' && categoria != 'V') {
				
				System.out.println("\n**** Categoria inv�lida, digite novamente ****");			
				System.out.printf("\nDigite a categoria %d� do produto:\n"
						+ "\n  C - cama.mesa e banho."
						+ "\n  E - eletrodom�sticos."
						+ "\n  V - vestu�rio.\n", cont + 1);
				categoria = sc.next().charAt(0);
				categoria = Character.toUpperCase(categoria);
			}
			
			
			switch(categoria) {
				case 'C':
					imposto = precoUnit * 0.3741;
					lucro = (precoUnit + imposto) * 0.30;
					precoVenda = precoUnit + imposto + lucro;
					quantCama += quantidade;
					totalCama += precoVenda * quantidade;
					System.out.printf("\n ****** FICHA DO %d� PRODUTO LAN�ADO ****** "
							+ "\n\n  Categoria:............ Cama, mesa e banho"
							+ "\n  Quantidade:........... %d unid."
							+ "\n  Pre�o Unit�rio:....... R$ %.2f"
							+ "\n  Imposto de 37,41%%:.... R$ %.2f"
							+ "\n  Lucro de 30%%:......... R$ %.2f"
							+ "\n  Pre�o de venda:....... R$ %.2f", cont + 1, quantidade, precoUnit, imposto, lucro, precoVenda);
					System.out.println("\n\n *****************************************\n");
					break;
				case 'E':
					imposto = precoUnit * 0.4314;
					lucro = (precoUnit + imposto) * 0.35;
					precoVenda = precoUnit + imposto + lucro;
					quantEletro += quantidade;
					totalEletro += precoVenda * quantidade;
					System.out.printf("\n ****** FICHA DO %d� PRODUTO LAN�ADO ****** "
							+ "\n\n  Categoria:............ Eletrodom�stico"
							+ "\n  Quantidade:........... %d unid."
							+ "\n  Pre�o Unit�rio:....... R$ %.2f"
							+ "\n  Imposto de 43,14%%:.... R$ %.2f"
							+ "\n  Lucro de 35%%:......... R$ %.2f"
							+ "\n  Pre�o de venda:....... R$ %.2f", cont + 1, quantidade, precoUnit, imposto, lucro, precoVenda);
					System.out.println("\n\n *****************************************\n");
					break;
				case 'V':
					imposto = precoUnit * 0.3842;
					lucro = (precoUnit + imposto) * 0.50;
					precoVenda = precoUnit + imposto + lucro;
					quantVestu += quantidade;
					totalVestu += precoVenda * quantidade;
					System.out.printf("\n ****** FICHA DO %d� PRODUTO LAN�ADO ****** "
									+ "\n\n  Categoria:............ Vestu�rio"
									+ "\n  Quantidade:........... %d unid."
									+ "\n  Pre�o Unit�rio:....... R$ %.2f"
									+ "\n  Imposto de 38,42%%:.... R$ %.2f"
									+ "\n  Lucro de 50%%:......... R$ %.2f"
									+ "\n  Pre�o de venda:....... R$ %.2f", cont + 1, quantidade, precoUnit, imposto, lucro, precoVenda);
					System.out.println("\n\n *****************************************\n");
					break;			
			}
			
			cont++;
		}
		System.out.println("\n *****************************************");
		System.out.println(" *********    RELAT�RIO GERAL    ********* ");
		System.out.println(" *****************************************");
		System.out.printf("\n CAMA, MESA E BANHO:"
				+ "\n Quantidade do estoque.......... %d"
				+ "\n Valor total dos produtos....... R$ %.2f", quantCama, totalCama);
		System.out.printf("\n\n ELETRODOM�STICO:"
				+ "\n Quantidade do estoque.......... %d"
				+ "\n Valor total dos produtos....... R$ %.2f", quantEletro, totalEletro);
		System.out.printf("\n\n VESTUARIO:"
				+ "\n Quantidade do estoque.......... %d"
				+ "\n Valor total dos produtos....... R$ %.2f", quantVestu, totalVestu);
		
		sc.close();
	}

}
