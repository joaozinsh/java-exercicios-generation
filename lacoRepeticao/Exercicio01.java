package lacoRepeticao;

public class Exercicio01 {

	/*
	 * Data: 06/05/2021
	 * 1- Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos
	 * resto = 5. (FOR)
	 */
	
	public static void main(String[] args) {
		
		System.out.println("Todos os números de 1000 a 1999 que quando divididos por 11 temos resto 5:\n");
		
		for(int x = 1000; x <= 1999; x++) {
			if(x % 11 == 5) {
				System.out.println(x);
			}
		}

	}

}
