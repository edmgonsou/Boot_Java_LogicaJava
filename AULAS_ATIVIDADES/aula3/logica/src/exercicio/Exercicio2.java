package exercicio;;

public class Exercicio2 {

	public static void main(String[] args) {
				
		int ano;
		double sInicial, sAtual=0;
		
		double reaj2015 = 8.8/100+1;
		double reaj2016 = 11.67/100+1;
		double reaj2017 = 6.47/100+1;
		double reaj2018 = 1.81/100+1;
		double reaj2019 = 4.61/100+1;
		double reaj2020 = 4.68/100+1;
		double reaj2021 = 5.26/100+1;
		double reaj2022 = 10.18/100+1;
		
		ano = 2016;
		sInicial = 1000.00;		
		
		switch(ano) {
			case 2015:
				sAtual = ((((((sInicial*reaj2016)*reaj2017)*reaj2018)*reaj2019)*reaj2020)*reaj2021)*reaj2022;
				break;
			case 2016:
				sAtual = (((((sInicial*reaj2017)*reaj2018)*reaj2019)*reaj2020)*reaj2021)*reaj2022;
				break;
			case 2017:
				sAtual = ((((sInicial*reaj2018)*reaj2019)*reaj2020)*reaj2021)*reaj2022;
				break;
			case 2018:
				sAtual = (((sInicial*reaj2019)*reaj2020)*reaj2021)*reaj2022;
				break;
			case 2019:
				sAtual = ((sInicial*reaj2020)*reaj2021)*reaj2022;
				break;
			case 2020:
				sAtual = (sInicial*reaj2021)*reaj2022;
				break;
			case 2021:
				sAtual = sInicial*reaj2022;
				break;
			case 2022:
				System.out.println("\nEste � o ano atual o sal�rio deste funcion�rio ser� reajustado no pr�ximo ano");
				break;
				default:
					System.out.println("\nAno inv�lido, digite um ano de 2015 at� 2022.");
		}
		if (ano >= 2022 || ano < 2015) {
			
		}else
			
		System.out.printf("\nO sal�rio atual em 2022 deste funcion�rio � %.2f", sAtual);
					
		}
		
		
	}


