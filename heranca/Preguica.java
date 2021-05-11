package heranca;

public class Preguica extends Animal{

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void emitirSom() {	
		System.out.println("Som: Aaahhh");
	}

	@Override
	public void locomover() {
		System.out.println("Deve: Subir árvores");
	}
	
	public void imprimirInfo() {	
		System.out.println("\nNome da preguiça: "+getNome()+
				"\nIdade: "+getIdade());
	}
}