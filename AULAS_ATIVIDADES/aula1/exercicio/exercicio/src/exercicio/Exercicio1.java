package exercicio;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		double n1, n2, n3, n4, mediaPonderada;
		
		Scanner recebe = new Scanner(System.in);
		
		System.out.println("Informe o valor de N1: ");
		n1 = recebe.nextDouble();
		System.out.println("Informe o valor de N2: ");
		n2 = recebe.nextDouble();
		System.out.println("Informe o valor de N3: ");
		n3 = recebe.nextDouble();
		System.out.println("Informe o valor de N4: ");
		n4 = recebe.nextDouble();
		
		mediaPonderada = ((n1*2)+(n2*2)+(n3*3)+(n4*3))/(2+2+3+3);
		
		System.out.printf("A média ponderada de %.1f, %.1f, %.1f e %.1f é: %.1f", n1, n2, n3, n4, mediaPonderada);
		
		recebe.close();
	}

}
