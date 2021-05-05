package lacodecisao;

import java.util.Scanner;

public class Exercicio01 {
	
	/* 
	 * Data: 05/05/2021
	 * 1- Faça um programa que receba três inteiros e diga qual deles é o maior.
	 */

	public static void main(String[] args) {		
		
		int num1, num2, num3, maior = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = sc.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3){
			maior = num1;
			
		} else if(num2 > num1 && num2 > num3) {
			maior = num2;
			
		} else {
			maior = num3;
		}
		
		System.out.println("\nMaior número digitado: "+maior);
		
		sc.close();
	}

}
