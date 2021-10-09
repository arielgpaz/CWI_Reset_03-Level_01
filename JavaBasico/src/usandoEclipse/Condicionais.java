package usandoEclipse;

import java.util.Scanner;

public class Condicionais {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Resultado do aluno");
		
		System.out.println("Digite as quatro notas do aluno:");
		float nota1 = scan.nextFloat();
		float nota2 = scan.nextFloat();
		float nota3 = scan.nextFloat();
		float nota4 = scan.nextFloat();
		float media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if(media == 10) {
			System.out.println("Aluno aprovado com louvores!");
		} else if (media >= 7) {
			System.out.println("Aluno aprovado!");
		} else {
			System.out.println("Aluno reprovado!");
		}
		
		System.out.println("\nDia da semana");
		
		System.out.println("Digite um número de 1 a 7");
		int dia = scan.nextInt();
		switch(dia) {
		case 1: System.out.println("Domingo"); break;
		case 2: System.out.println("Segunda-feira"); break;
		case 3: System.out.println("Terça-feira"); break;
		case 4: System.out.println("Quarta-feira"); break;
		case 5: System.out.println("Quinta-feira"); break;
		case 6: System.out.println("Sexta-feira"); break;
		case 7: System.out.println("Sábado"); break;
		default: System.out.println("Valor inválido");
		}
		
		scan.close();
	}
}
