package model;

public class Diretoria extends User{
	private String cargo;
	private float salario;
	private String senha;
	
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
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Diretoria(int id, String nome, String email, String telefone, String nickname, String cep, String endereço,
			String bairro, String dataNascimento, String sexo, String cpf, String cargo, float salario, String senha) {
		super(id, nome, email, telefone, nickname, cep, endereço, bairro, dataNascimento, sexo, cpf);
		this.cargo = cargo;
		this.salario = salario;
		this.senha = senha;
	}
	@Override
	public String toString() {
		return "Diretoria [cargo=" + cargo + ", salario=" + salario + ", senha=" + senha + "]";
	}
	
    
	
}
