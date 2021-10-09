package usandoEclipse;

import java.util.Scanner;

public class VetorDeIdades {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] idades;
		 idades = new int[10];
		int pessoasMaioresDeIdade = 0;
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println("Digite a idade da " + (i + 1) + "ª pessoa");
			int idade = scan.nextInt();
			idades[i] = idade;
			
			if ( idades[i] >= 18 ) {
				pessoasMaioresDeIdade += 1;
			}	
		}
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println("Idade da " + ( i + 1) + "ª pessoa: " + idades[i]);
		}
		System.out.println("Quantidade de pessoas maiores de idade: " + pessoasMaioresDeIdade);
		
		scan.close();
	}
}
