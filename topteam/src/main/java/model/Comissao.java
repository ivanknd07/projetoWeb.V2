package model;

public class Comissao extends User{
 
	private String cargo;
	private float salario;
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Comissao [cargo=" + cargo + ", salario=" + salario + "]";
	}
	public Comissao(int id, String nome, String email, String telefone, String nickname, String cep, String endereço,
			String bairro, String dataNascimento, String sexo, String cpf, String cargo, float salario) {
		super(id, nome, email, telefone, nickname, cep, endereço, bairro, dataNascimento, sexo, cpf);
		this.cargo = cargo;
		this.salario = salario;
	}
	
	
	
}
