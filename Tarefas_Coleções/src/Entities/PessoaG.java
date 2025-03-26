package Entities;

public class PessoaG  implements Comparable<PessoaG>{
	private String nome;
	private String genero;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public PessoaG(String nome, String genero) {
		super();
		this.nome = nome;
		this.genero = genero;
	}

	public int compareTo(PessoaG outraPessoa) {
		return this.nome.compareTo(outraPessoa.nome);
	}

	

}
