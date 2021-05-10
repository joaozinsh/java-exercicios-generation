package orientacaoObjeto;

import java.text.NumberFormat;
import java.util.Scanner;

public class Funcionario {

	Scanner sc = new Scanner(System.in);
	
	private String nome;
	private int codigo;
	private double salario;
	
	public Funcionario(String nome, int codigo, double salario) {
		this.nome = nome;
		this.codigo = codigo;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String formatarSalario()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		nf.setMinimumFractionDigits(2);
		
		String formatoSalario = nf.format(salario);
		
		return formatoSalario;
	}
	
	public void aumentarSalario(double porcentagem) {
		salario *= 1 + porcentagem / 100;
	}
	
	public void mostrarFuncionario() {
		System.out.println("\nNome do funcionário: "+nome+"\nCódigo: "+codigo+"\nSalário: "+this.formatarSalario());
	}
}
