package sequencial;

import java.util.Scanner;

public class Aumento2 {

	public static void main(String[] args) {

		double salarioBruto, novoSalario, percentual;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o sal?rio Bruto: R$ ");
		salarioBruto = sc.nextDouble();
		System.out.println("Informe o percentual de aumento: ");
		percentual = sc.nextDouble();
		
		novoSalario = salarioBruto * (1 + percentual/100);
		
		System.out.printf("O sal?rio bruto ?: R$ %.2f\nO reajuste ? de: %.0f\nO novo salario ?: R$ %.2f\n", salarioBruto, percentual, novoSalario);
		
		sc.close();

	}

}
