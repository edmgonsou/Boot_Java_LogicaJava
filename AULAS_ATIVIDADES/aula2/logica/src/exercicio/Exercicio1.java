package exercicio;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String disciplina, resultado;
		int quantAulas, numfaltas;
		double nota1, nota2, nota3, nota4, media;
		
		
		System.out.println("Informe a disciplina: ");
		disciplina = sc.next();
		System.out.println("Informe a quantidade de aulas: ");
		quantAulas = sc.nextInt();
		System.out.println("Informe as faltas: ");
		numfaltas = sc.nextInt();
		System.out.println("Informe a 1? nota: ");
		nota1 = sc.nextDouble();
		System.out.println("Informe a 2? nota: ");
		nota2 = sc.nextDouble();
		System.out.println("Informe a 3? nota: ");
		nota3 = sc.nextDouble();
		System.out.println("Informe a 4? nota: ");
		nota4 = sc.nextDouble();
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		
		if (media >= 6.0 && numfaltas < (quantAulas * 0.25)) {
			resultado = "aprovado";
		}else {
			resultado = "reprovado";
		}
		
		System.out.printf("\nNa disciplina: %s.\nA m?dia: %.1f.\nO n?mero de faltas: %d.\nStatus: %s.", disciplina, media, numfaltas, resultado);
		
		sc.close();
			
	}

}
