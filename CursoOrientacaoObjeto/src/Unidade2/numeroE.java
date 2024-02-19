package Unidade2;

import java.util.Scanner;

public class numeroE {

	public static void main(String[] args) {
		double ex = 0;
		double x ;
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("Digite o valor de X");
		
		x = scanner.nextDouble();
		for(int i = 1; i <=30; i++)
			ex = ex + (Math.pow(x, i))/i;
		
		System.out.println("O valor de e ("+ x +") é="+ ex);
		
		scanner.close();
	}

}
