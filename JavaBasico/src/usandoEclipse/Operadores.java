package usandoEclipse;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Soma de dois n�meros");
		
		System.out.println("Digite um n�mero: ");
		double num1 = scan.nextDouble();
		System.out.println("Digite outro n�mero: ");
		double num2 = scan.nextDouble();
		double soma = num1 + num2;
		System.out.println("A soma dos n�meros �: " + soma);
		
		System.out.println("\n\nM�dia de quatro notas");
		
		System.out.println("Digite as quatro notas:");
		float nota1 = scan.nextFloat();
		float nota2 = scan.nextFloat();
		float nota3 = scan.nextFloat();
		float nota4 = scan.nextFloat();
		float media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("A m�dia das notas �: " + media);
		
		System.out.println("\n\nSal�rio mensal");
		
		System.out.println("Quanto voc� ganha por hora?");
		float ganhoHora = scan.nextFloat();
		System.out.println("Voc� trabalha quantas horas por m�s?");
		int horasMes = scan.nextInt();
		System.out.println("O seu sal�rio mensal � de R$ " + ganhoHora*horasMes);
		
		scan.close();		
	}

}
