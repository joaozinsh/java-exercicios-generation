package heranca;

public class Cachorro extends Animal{
	
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Som: Au au");
	}
	
	@Override
	public void locomover() {
		System.out.println("Deve Correr");
	}
	
	public void imprimirInfo() {	
		System.out.println("\nNome do cachorro: "+getNome()+
				"\nIdade: "+getIdade());
	}

}