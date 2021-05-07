package lacoRepeticao;

import java.util.Scanner;

public class Exercicio04 {

	/*
	 * Autor: João Gabriel
	 * Data: 06/05/2021
	 * 
	 * 4- Uma empresa desenvolveu uma pesquisa para saber as características
	 * psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
	 * era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as
	 * opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa
	 * era agressiva). Pede-se para elaborar um sistema que permita ler os dados de
	 * 150 pessoas, calcule e mostre:
	 * o número de pessoas calma;
	 * o número de mulheres nervosas;
	 * o número de homens agressivos;
	 * o número de outros calmos;
	 * o número de pessoas nervosas com mais de 40 anos;
	 * o número de pessoas calmas com menos de 18 anos.
	 * 
	 * Foco do exercicio: Laço de Repetição WHILE
	 */
	
	public static void main(String[] args) {
		
		int idade, sexo, op, quantP = 1, quantC = 0, quantFN = 0, quantMA = 0, quantOC = 0, quantN40 = 0, quantC18 = 0;
		
		Scanner sc = new Scanner(System.in);
			
		while(quantP <= 6) {
			System.out.println("\nIdade: ");
			idade = sc.nextInt();
			
			System.out.println("Sexo, 1-Feminino; 2-Masculino; 3-Outros: ");
			sexo = sc.nextInt();
			
			System.out.println("1-Calma; 2-Nervosa; 3-Agressiva: ");
			op = sc.nextInt();
			
			if(op == 1) {
				quantC++;
				
				if(sexo == 3) {
					quantOC++;
				}
				if(idade < 18) {
					quantC18++;
				}
			} 
			if(op == 2) {
				if(sexo == 1) {
					quantFN++;
				}
				if(idade > 40) {
					quantN40++;
				}
			}
			if(op == 3 && sexo == 2) {
				quantMA++;		
			}
			
			quantP++;
		}
		
		System.out.println("\nO número de pessoas calma: "+quantC);
		System.out.println("O número de mulheres nervosas: "+quantFN);
		System.out.println("O número de homens agressivos: "+quantMA);
		System.out.println("O número de outros calmos: "+quantOC);
		System.out.println("O número de pessoas nervosas com mais de 40 anos: "+quantN40);
		System.out.println("O número de calmas com menos de 18 anos: "+quantC18);
		
		sc.close();
	}

}