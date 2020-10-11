package model;

public class Jogador extends User{
	
	private String posicao;
	private boolean status;
	private float salario;
	
	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public Jogador(int id, String nome, String email, String telefone, String nickname, String cep, String endereço,
			String bairro, String dataNascimento, String sexo, String cpf, String posicao, boolean status,
			float salario) {
		super(id, nome, email, telefone, nickname, cep, endereço, bairro, dataNascimento, sexo, cpf);
		this.posicao = posicao;
		this.status = status;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Jogador [posicao=" + posicao + ", status=" + status + ", salario=" + salario + "]";
	}
	
	
	
	
}
