package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {	
		/*
		 * Crie uma um programa para trabalhar com estoque de uma loja, o programa
		 * deverá trabalhar com Collection do tipo List do Java para manipular os dados
		 * desse estoque, o programa deverá atender as seguintes funcionalidades:
		 * Armazenar dados da List;
		 * Remover dados da list;
		 * Atualizar dados da list;
		 * Apresentar todos os dados da list.
		 */
		int op;
		
		ArrayList<String> estoque = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("\n1- Armazenar produtos no estoque"
					+ "\n2- Remover produtos do estoque"
					+ "\n3- Atualizar produtos do estoque"
					+ "\n4- Mostrar todos os produtos do estoque"
					+ "\n0 - Sair"
					+ "\n\nDigite sua opção: ");
			op = sc.nextInt();
			sc.nextLine();
			
			String produto, produtoAtt;
			boolean repetir = true;
			switch(op) {
			case 1:
				do {
					System.out.println("\nDigite um por um o nome do(s) produto(s) que iram ser armazenado(s) no estoque"
							+ "\nOu digite 0 (Zero) quando quiser parar:");
					produto = sc.nextLine().toLowerCase();
					if(produto.equals("0")) {
						repetir = false;
						break;
					}
					
					estoque.add(produto);
					
				} while(repetir == true);
				
				break;
				
			case 2:
				do {
					System.out.println("\nProdutos no estoque:");
					System.out.println(estoque);
					System.out.println("\n\nDigite o nome do produto para ser removido:");
					produto = sc.nextLine().toLowerCase();
					
					if(estoque.contains(produto)) {
						estoque.remove(produto);
						
					} else {
						System.err.println("\nEsse produto não existe no estoque!\n");
					}
					
					System.out.print("\nDesejar remover outro produto?"
							+ "\n1- Sim"
							+ "\n2- Não"
							+ "\nQual sua opção? ");
					int rm = sc.nextInt();
					sc.nextLine();
					
					if(rm == 1) {
						repetir = true;
					} else {
						repetir = false;
					}
					
				} while(repetir == true);
				
				break;
				
			case 3:
				do {
					System.out.println("\nProdutos no estoque:");
					System.out.println(estoque);
					System.out.println("\n\nDigite o nome do produto para ser atualizado:");
					produto = sc.nextLine().toLowerCase();
					
					System.out.println("\nDigite o nome do novo produto que irá substituir o produto "+produto);
					produtoAtt = sc.nextLine().toLowerCase();
					
					if(estoque.contains(produto)) {
						estoque.remove(produto);
						estoque.add(produtoAtt);
						
					} else {
						System.err.println("\nEsse produto não existe no estoque!\n");
					}
					
					System.out.print("\nDesejar atualizar outro produto?"
							+ "\n1- Sim"
							+ "\n2- Não"
							+ "\nQual sua opção? ");
					int rm = sc.nextInt();
					sc.nextLine();
					
					if(rm == 1) {
						repetir = true;
					} else {
						repetir = false;
					}
					
				} while(repetir == true);
				
				break;
				
			case 4:
				System.out.println("\nProdutos no estoque:");
				System.out.println(estoque);
				break;
				
			case 0:
				System.out.println("\nEncerrando programa...");
				break;
				
				default:
					System.err.println("\nOpção inválida, tente novamente!");
			}
			
		}while(op != 0);
		
		sc.close();
	}

}
