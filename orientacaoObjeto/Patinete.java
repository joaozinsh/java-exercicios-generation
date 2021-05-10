package orientacaoObjeto;

import java.util.Scanner;

public class Patinete {

	Scanner sc = new Scanner(System.in);
	
	public String marca;
	public String cor;
	public String eletrico;
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String isEletrico() {
		return eletrico;
	}
	
	public void setEletrico(String eletrico) {
		this.eletrico = eletrico;
	}
	
	public void imprimir() {
		System.out.println("\nMarca do patinete: "+marca+"\nCor: "+cor+"\nÉ eletrico: "+eletrico);
	}
	
}
