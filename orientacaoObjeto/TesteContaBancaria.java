package orientacaoObjeto;

public class TesteContaBancaria {

	public static void main(String[] args) {
		
		ContaBancaria cb1 = new ContaBancaria("João", 1234, 400);
		
		cb1.imprimir();
		cb1.sacar(200);
		cb1.imprimir();
		cb1.depositar(300);
		cb1.imprimir();
		
		ContaBancaria cb2 = new ContaBancaria("Maria", 5678, 620);
		
		cb2.imprimir();
		cb2.sacar(700);
		cb2.imprimir();
		cb2.depositar(100);
		cb2.imprimir();
	}

}