package lacoRepeticao;

import java.util.Scanner;

public class Exercicio06 {

	/*
	 * Data: 06/05/2021
	 * 6- Escrever um programa que receba vários números inteiros no teclado. E no
	 * final imprimir a média dos números múltiplos de 3. Para sair digitar
	 * 0(zero).(DO...WHILE)
	 */
	
	public static void main(String[] args) {
		
		int num;
		double media = 0, somaNum = 0,  quant = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Entre com um número: ");
			num = sc.nextInt();
			
			if(num % 3 == 0 && num != 0) {
				somaNum = somaNum + num;
				quant++;
			}
			
		} while(num != 0);

		media = somaNum / quant;
		
		System.out.printf("\nMédia dos números múltiplos de 3: %2.2f",media);
		
		sc.close();
	}

}
