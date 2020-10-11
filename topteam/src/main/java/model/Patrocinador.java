package model;

public class Patrocinador {
	private int idPatri;
	private String nome;
	private float patrocinio;
	
	public int getIdPatri() {
		return idPatri;
	}
	public void setIdPatri(int idPatri) {
		this.idPatri = idPatri;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPatrocinio() {
		return patrocinio;
	}
	public void setPatrocinio(float patrocinio) {
		this.patrocinio = patrocinio;
	}
	@Override
	public String toString() {
		return "Patrocinador [idPatri=" + idPatri + ", nome=" + nome + ", patrocinio=" + patrocinio + "]";
	}
	public Patrocinador(int idPatri, String nome, float patrocinio) {
		super();
		this.idPatri = idPatri;
		this.nome = nome;
		this.patrocinio = patrocinio;
	}
	
	
	
}
