package exercicio;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double base = 0, altura= 0, resultado;
		
		System.out.println("CALCULAR ?REA DE UM TRI?NGULO");
		System.out.println("\nDigite a base do tri?ngulo: ");
		base = sc.nextDouble();
		System.out.println("Digite a altura do tri?ngulo: ");
		altura = sc.nextDouble();
		
		while(base <= 0 || altura <= 0) {
			System.out.println("\nDigite para BASE ou ALTURA valores maior que ZERO");
				System.out.println("\n\nCALCULAR ?REA DE UM TRI?NGULO");
				System.out.println("\nDigite a base do tri?ngulo: ");
				base = sc.nextDouble();
				System.out.println("Digite a altura do tri?ngulo: ");
				altura = sc.nextDouble();
						
		}
		resultado = (base * altura)/2;
		System.out.printf("\nBase do tri?ngulo: %.1f\nAltura do tri?ngulo: %.1f"
				+ "\nA ?rea total do tri?ngulo: %.1f", base, altura, resultado);
		sc.close();

	}

}
