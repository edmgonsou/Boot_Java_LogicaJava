package exercicio;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		double salario, valorImposto = 0, aliq = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu salário: ");
		salario = sc.nextDouble();
		
		if (salario <= 1903.98) {			
			System.out.println("Esta inseto de pagar IR");
		}else if (salario <= 2826.65) {
			aliq = 0.075;
			valorImposto = salario * aliq;
		}else if(salario <= 3751.06) {
			aliq = 0.15;
			valorImposto = salario * aliq;
		}else if(salario <= 4664.68) {
			aliq = 0.225;
			valorImposto = salario * aliq;
		}else {
			aliq = 0.275;
			valorImposto = salario * aliq;
		}
		
		System.out.printf("\nA sua renda é: %.2f\nA alíquota é: %.1f\nO valor do IR é: %.2f", salario, aliq*100, valorImposto);
		
		sc.close();

	}

}
