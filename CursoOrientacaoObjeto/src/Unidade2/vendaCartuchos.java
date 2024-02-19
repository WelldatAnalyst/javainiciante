package Unidade2;

import java.util.Scanner;

public class vendaCartuchos {

	public static void main(String[] args) {
		
		final int VALOR_CARTUCHO = 50;
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("Digite o numero de cartuchos");
		int numeroCartuchos = scanner.nextInt();
		double valorVenda=0;
		
		if(numeroCartuchos <=500)
			valorVenda = numeroCartuchos * VALOR_CARTUCHO * 0.95;
		else if (numeroCartuchos <= 1000)
			valorVenda = numeroCartuchos * VALOR_CARTUCHO * 0.93;
		else if (numeroCartuchos <= 1500)
			valorVenda = numeroCartuchos * VALOR_CARTUCHO * 0.91;
		else
			valorVenda = numeroCartuchos * VALOR_CARTUCHO * 0.9;
		
		System.out.print("O valor de venda é"+ valorVenda);
		
		scanner.close();
		

	}

}
