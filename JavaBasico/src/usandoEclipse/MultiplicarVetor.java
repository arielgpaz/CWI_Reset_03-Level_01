package usandoEclipse;

import java.util.Scanner;

public class MultiplicarVetor {
	
	public static void main (String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		double[] primeiroVetor = new double[5];
		double[] segundoVetor = new double[5];
		
		for (int i = 0; i < primeiroVetor.length; i++) {
						System.out.println("Digite o " + ( i + 1) + "º valor para armazenar no primeiro Vetor");
			double valorVetor = scan.nextDouble();
			primeiroVetor[i] = valorVetor;
			segundoVetor[i] = primeiroVetor[i]*2;
		}
		
		for (int i = 0; i < primeiroVetor.length; i++) {
			if ( i == 0 ) {
				System.out.println("primeiroVetor \t segundoVetor");
			}
			
			System.out.println("" + primeiroVetor[i] + "\t\t" + segundoVetor[i]);
		}
		
		scan.close();
	}
}
