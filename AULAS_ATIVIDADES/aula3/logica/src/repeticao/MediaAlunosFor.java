package repeticao;

import java.util.Scanner;

public class MediaAlunosFor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double total = 0;
		int contador;
		
		for(contador = 0; contador <= 9; contador++) {
			System.out.printf("\nDigite a %d? nota: ", contador+1);
			double nota = sc.nextDouble();
			total += nota;			
		}
		double media = total / contador;
		
		System.out.printf("\nTotal de alunos da classe ? %d.", contador);
		System.out.printf("\nTotal de notas dos alunos ? %.1f.", total);
		System.out.printf("\nM?dia da classe ? %.1f.", media);
		
		sc.close();
	}

}
