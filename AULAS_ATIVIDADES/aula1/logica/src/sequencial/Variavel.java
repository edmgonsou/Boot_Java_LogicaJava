package sequencial;

public class Variavel {

	public static void main(String[] args) {
		
		int quantidade = 1500;
		float valorMercadoria = 750.28f;
		double peso = 78.3;
		char genero = 'F';
		
		System.out.printf("A quantidade de itens em estoque é: %d\n", quantidade);
		System.out.printf("O valor da parcela é: R$ %.1f\n", valorMercadoria);
		System.out.printf("O peso do Erinaldo é: %f \n", peso);
		System.out.printf(" Do genero %c tem matriculados %d alunas", genero, quantidade);
	}

}
