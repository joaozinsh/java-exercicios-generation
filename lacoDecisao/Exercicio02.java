package lacoDecisao;

import java.util.Scanner;

public class Exercicio02 {

	/* 
	 * Autor: João Gabriel
	 * Data: 05/05/2021
	 * 
	 * 2- Faça um programa que entre com três números e coloque em ordem crescente.
	 * 
	 * Foco do exercicio: Laço de Decisão IF
	 */
	
	public static void main(String[] args) {
		
		int num1, num2, num3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		num2 = sc.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		num3 = sc.nextInt();
		
		if(num1 <= num2 && num2 <= num3) {
			System.out.println("Ordem crescente: "+num1+", "+num2+", "+num3);
			
		} else if(num1 <= num2 && num3 <= num2) {
			System.out.println("Ordem crescente: "+num1+", "+num3+", "+num2);
			
		} else if(num2 <= num1 && num1 <= num3) {
			System.out.println("Ordem crescente: "+num2+", "+num3+", "+num1);
			
		} else if(num2 <= num1 && num2 <= num3 && num3 >= num1){
			System.out.println("Ordem crescente: "+num2+", "+num1+", "+num3);
			
		} else if(num3 <= num1 && num3 <= num2 && num1 >= num2) {
			System.out.println("Ordem crescente: "+num3+", "+num2+", "+num1);
			
		} else if(num3 <= num1 && num3 <= num2 && num2 >= num1){
			System.out.println("Ordem crescente: "+num3+", "+num1+", "+num2);
		}
		
		sc.close();
	}

}