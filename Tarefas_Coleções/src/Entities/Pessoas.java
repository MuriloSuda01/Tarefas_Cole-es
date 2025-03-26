package Entities;

public class Pessoas implements Comparable<Pessoas> {
	private String nome;

	public Pessoas(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int compareTo(Pessoas outraPessoa) {
		return this.nome.compareTo(outraPessoa.nome);
	}

	@Override
	public String toString() {
		return "Pessoas [nome=" + nome + "]";
	}


}
