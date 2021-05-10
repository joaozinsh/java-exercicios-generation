package orientacaoObjeto;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario[] fc = new Funcionario[3];
		
		fc[0] = new Funcionario("João", 123, 4000);
		fc[1] = new Funcionario("Maria", 456, 5429.35);
		fc[2] = new Funcionario("José", 789, 3500);
		
		for(Funcionario i: fc) {
			i.mostrarFuncionario();
		}
		
		for(Funcionario i: fc) {
			i.aumentarSalario(10);
		}
		
		System.out.println("\n\t***Aumento de 10% nos salário***");
		for(Funcionario i: fc) {
			i.mostrarFuncionario();
		}
		
	}

}
