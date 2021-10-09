package usandoEclipse;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Exercício 01
		System.out.println("Exercício 01");
		boolean notaValida = false;
		
		while (notaValida == false) {
			System.out.println("Digite uma nota entre 0 e 10");
			float nota = scan.nextFloat();
			
			if ((nota < 0) || (nota >10)) {
				System.out.println("Nota fora do intervalo permitido.");
			} else {
				System.out.println("A nota é: " + nota);
				notaValida = true;
			}
		}
		
		//Exercício 02
		System.out.println("\nExercício 02");
		System.out.println("Digite o primeiro número inteiro");
		int num1 = scan.nextInt();
		int imprimir = 0;
		
		while(imprimir < 1) {
			System.out.println("Digite o segundo número inteiro");
			int num2 = scan.nextInt();
			if (num2 <= num1) {
				System.out.println("O segundo número precisa ser maior que o primeiro");
				continue;
			} else {
				for (imprimir = num1 + 1; imprimir < (num2) ; imprimir++) {
					System.out.println("" + imprimir);
				}
			}
		}
		
		//Exercício 03		
		System.out.println("\nExercício 03");
		System.out.println("Digite o 1º número");
		double numb1 = scan.nextDouble();
		double numb2;
		double maiorNumero = numb1;
		int cont = 2;
		
		do {
			System.out.println("Digite o " + cont + "º número");
			numb2 = scan.nextDouble();
			if (numb2 > maiorNumero) {
				maiorNumero = numb2;
			}
			cont++;
		} while (cont <= 5);
		
		System.out.println("\nO Maior número é: " + maiorNumero);
		
		//Exercício 04
		System.out.println("\nExercício 04");
		System.out.println("Digite um numero inteiro entre 1 e 10");
		int numTabuada = scan.nextInt();
		System.out.println("Tabuada do " + numTabuada);
		
		for (int contador = 1; contador <= 10; contador++) {
			System.out.println(numTabuada + " x " + contador + " = " + numTabuada * contador);
		}
		
		scan.close();
	}

}
