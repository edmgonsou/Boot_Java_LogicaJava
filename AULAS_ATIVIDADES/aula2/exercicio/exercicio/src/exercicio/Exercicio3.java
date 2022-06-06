package exercicio;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEscolha a Opção:\n1. Domingo\n2. Segunda\n3. Terça"
				+ "\n4. Quarta\n5. Quinta\n6. Sexta\n7. Sábado");
		num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("Você escolheu Domingo");
			break;
		case 2:
			System.out.println("Você escolheu Segunda-Feira");
			break;
		case 3:
			System.out.println("Você escolheu Terça-Feira");
			break;
		case 4:
			System.out.println("Você escolher Quarta-Feira");
			break;
		case 5:
			System.out.println("Você escolher Quinta-Feira");
			break;
		case 6:
			System.out.println("Você escolher Sexta-Feira");
			break;
		case 7:
			System.out.println("Voce escolheu Sábado");
			break;
		default:
			System.out.println("Opção inválida");
		}
		
		sc.close();

	}

}
