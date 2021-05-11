package heranca;

public class Cavalo extends Animal{

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void emitirSom() {	
		System.out.println("Som: Hinn in in");
	}

	@Override
	public void locomover() {
		System.out.println("Deve: Correr");
	}

	public void imprimirInfo() {	
		System.out.println("\nNome do cavalo: "+getNome()+
				"\nIdade: "+getIdade());
	}
	
}