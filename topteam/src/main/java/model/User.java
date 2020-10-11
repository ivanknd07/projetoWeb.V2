package model;

public class User {
	
	  int id;
	 String nome;
	 String email;
	 String telefone;
	 String nickname;
	 String cep;
	 String endereco;
	 String bairro;
	 String dataNascimento;
	 String sexo;
	 String cpf;
	public User(int id, String nome, String email, String telefone, String nickname, String cep, String endereco,
			String bairro, String dataNascimento, String sexo, String cpf) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.nickname = nickname;
		this.cep = cep;
		this.endereco = endereco;
		this.bairro = bairro;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.cpf = cpf;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone + ", nickname="
				+ nickname + ", cep=" + cep + ", endereco=" + endereco + ", bairro=" + bairro + ", dataNascimento="
				+ dataNascimento + ", sexo=" + sexo + ", cpf=" + cpf + "]";
	}
	 
	
	
}
