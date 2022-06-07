package exercicio;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cont, aprov=0, reprov=0;
		double nota, total = 0, media;
		
		for(cont = 1; cont <=10; cont++) {
			System.out.printf("\nDigite a nota do %dº aluno: ", cont);
			nota = sc.nextDouble();
			total += nota;
			if(nota >= 6.0) {
				aprov++;
				System.out.println("Este aluno foi aprovado.");
			}else {
				reprov++;
				System.out.println("Este aluno foi reprovado.");
			}			
		}
		media = total / cont;
		System.out.printf("\nQuantidade de alunos aprovados: %d."
				+ "\nQuantidade de alunos reprovados: %d."
				+ "\nMédia da turma: %.1f", aprov, reprov, media);
		
		sc.close();
	}

}
