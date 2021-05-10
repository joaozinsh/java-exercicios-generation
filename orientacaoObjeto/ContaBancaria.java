package orientacaoObjeto;

public class ContaBancaria {

	private String nome;
	private int numeroConta;
	private double saldo;
	
	public ContaBancaria(String nome, int numeroConta, double saldo) {
		this.nome = nome;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void sacar(double valor) {
		double resultado;
		
		resultado = saldo - valor;
		
		if (resultado < 0) {
			System.err.println("\n"+nome+ ", você não possui R$"+valor+" em conta!");
			
		} else {
			saldo = resultado;
			System.out.println("\nSaque de R$ "+valor+" realizado!");
		}
	}
	
	public void depositar(double valor) {
		saldo += valor;
		System.out.println("\nDeposito de R$ "+valor+" realizado!");
	}
	
	public void imprimir() {
		System.out.println("\nNome do cliente: "+nome+"\nNúmero da conta: "+numeroConta+"\nSaldo: R$ "+saldo);
	}
	
}