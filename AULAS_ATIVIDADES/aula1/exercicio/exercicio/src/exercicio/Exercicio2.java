package exercicio;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		double salarioBruto, novoSalarioBruto, percentualDesc = 11;
		
		Scanner recebe = new Scanner(System.in);
		
		System.out.println("Informe o sal�rio bruto: ");
		salarioBruto = recebe.nextDouble();
		
		novoSalarioBruto = salarioBruto *(1-0.11);
		
		System.out.printf("Sal�rio Bruto: R$ %.2f\nDesconto INSS: %.0f\nNovo Sal�rio: R$ %.2f", salarioBruto, percentualDesc, novoSalarioBruto);
		
		recebe.close();

	}

}
