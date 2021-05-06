package lacoRepeticao;

import java.util.Scanner;

public class Exercicio02 {

	/* 
	 * Data: 06/05/2021
	 * 2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
	
	public static void main(String[] args) {
		
		int num, quantPar = 0, quantImpar = 0;

		Scanner sc = new Scanner(System.in);
		
		for(int x = 1; x <= 10; x++) {
			System.out.println("Entre com o "+x+"o número: ");
			num = sc.nextInt();
			
			if(num % 2 == 0) {
				quantPar++;
				
			} else {
				quantImpar++;
			}
		}
		
		System.out.println("\nDos 10 números digitados, "+quantPar+" são pares e "+quantImpar+" são ímpares");
		
		sc.close();
	}

}
