package OOP;

import java.util.Scanner;

public class CotacaoDolar {

		double dolar;
		double Reais;
		double IOF = 6;

	public double precoDolar() {
		return dolar * Reais;
	}

	public double iof() {
		return precoDolar() * IOF / 100;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		CotacaoDolar Conversao = new CotacaoDolar();

		System.out.println("Qual o preço do dolar?: ");
			Conversao.Reais = sc.nextDouble();
		System.out.println("Quantos doláres vc irá comprar?: ");
			Conversao.dolar = sc.nextDouble();

		System.out.println(Conversao.precoDolar() + Conversao.iof());

		sc.close();
	}

}
