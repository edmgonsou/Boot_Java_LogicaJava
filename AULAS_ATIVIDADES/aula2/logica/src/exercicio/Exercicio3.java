package exercicio;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEscolha a Op??o:\n1. Domingo\n2. Segunda\n3. Ter?a"
				+ "\n4. Quarta\n5. Quinta\n6. Sexta\n7. S?bado");
		num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("Voc? escolheu Domingo");
			break;
		case 2:
			System.out.println("Voc? escolheu Segunda-Feira");
			break;
		case 3:
			System.out.println("Voc? escolheu Ter?a-Feira");
			break;
		case 4:
			System.out.println("Voc? escolher Quarta-Feira");
			break;
		case 5:
			System.out.println("Voc? escolher Quinta-Feira");
			break;
		case 6:
			System.out.println("Voc? escolher Sexta-Feira");
			break;
		case 7:
			System.out.println("Voce escolheu S?bado");
			break;
		default:
			System.out.println("Op??o inv?lida");
		}
		
		sc.close();

	}

}
