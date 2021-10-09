package usandoEclipse;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Soma de dois números");
		
		System.out.println("Digite um número: ");
		double num1 = scan.nextDouble();
		System.out.println("Digite outro número: ");
		double num2 = scan.nextDouble();
		double soma = num1 + num2;
		System.out.println("A soma dos números é: " + soma);
		
		System.out.println("\n\nMédia de quatro notas");
		
		System.out.println("Digite as quatro notas:");
		float nota1 = scan.nextFloat();
		float nota2 = scan.nextFloat();
		float nota3 = scan.nextFloat();
		float nota4 = scan.nextFloat();
		float media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("A média das notas é: " + media);
		
		System.out.println("\n\nSalário mensal");
		
		System.out.println("Quanto você ganha por hora?");
		float ganhoHora = scan.nextFloat();
		System.out.println("Você trabalha quantas horas por mês?");
		int horasMes = scan.nextInt();
		System.out.println("O seu salário mensal é de R$ " + ganhoHora*horasMes);
		
		scan.close();		
	}

}
