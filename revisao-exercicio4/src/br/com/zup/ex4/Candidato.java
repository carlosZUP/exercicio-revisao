package br.com.zup.ex4;

public class Candidato {

	private String nomeCandidato;
	private int numeroCandidato;
	private int quantidadeVotos;
	

	// método construtor
	public Candidato(String nomeCandidato, int numeroCandidato) {
		super();
		this.nomeCandidato = nomeCandidato;
		this.numeroCandidato = numeroCandidato;
		

	}
	//Construindo getters e setters
	public String getNomeCandidato() {
		return nomeCandidato;
	}

	public void setNomeCandidato(String nomeCandidato) {
		this.nomeCandidato = nomeCandidato;
	}

	public int getNumeroCandidato() {
		return numeroCandidato;
	}

	public void setNumeroCandidato(int numeroCandidato) {
		this.numeroCandidato = numeroCandidato;
	}

	public int getQuantidadeVotos() {
		return quantidadeVotos;
	}

	public void setQuantidadeVotos(int quantidadeVotos) {
		this.quantidadeVotos = quantidadeVotos;
	}

	@Override
	public String toString() {
		
		String modelo ="";
		
		modelo += "Nome do candidato -> " + this.getNomeCandidato() + "\n";
		modelo += "Número do candidato ->" + this.getNumeroCandidato() + "\n";
		modelo += "Quantidade de votos -> " + this.getQuantidadeVotos() + "\n";
		
		return modelo;
	}
}
