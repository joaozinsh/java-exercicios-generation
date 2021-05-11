package heranca;

public abstract class Animal {

	private String nome;
	private int idade;
	
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public abstract void emitirSom();
	public abstract void locomover();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}

}