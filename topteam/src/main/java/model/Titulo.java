package model;

public class Titulo {
	private int idTit;
	private String nome;

	
	public int getIdTit() {
		return idTit;
	}

	public void setIdTit(int idTit) {
		this.idTit = idTit;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Titulo [idTit=" + idTit + ", nome=" + nome + "]";
	}

	public Titulo(int idTit, String nome) {
		super();
		this.idTit = idTit;
		this.nome = nome;
	}


	
	
}
