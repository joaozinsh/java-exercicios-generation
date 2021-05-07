package lacoDecisao;

import java.util.Scanner;

public class Exercicio03 {

	/* 
	 * Autor: João Gabriel
	 * Data: 05/05/2021
	 * 
	 * 3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
	 * 10-14 infantil
	 * 15-17 juvenil
	 * 18-25 adulto
	 * 
	 * Foco do exercicio: Laço de Decisão IF
	 */
	
	public static void main(String[] args) {
		
		int idade;
		String categoria = "Nenhuma categoria";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual sua idade? ");
		idade = sc.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			categoria = "Infantil";
			
		} else if(idade >= 15 && idade <=17) {
			categoria = "Juvenil";
			
		} else if(idade >=18 && idade <=25) {
			categoria = "Adulto";
		}
		
		System.out.println("\nVocê está na categoria: "+categoria);
		
		sc.close();
	}

}
