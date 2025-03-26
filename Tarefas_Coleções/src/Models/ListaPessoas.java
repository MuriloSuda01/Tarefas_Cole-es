package Models;


import java.util.Set;

import java.util.TreeSet;

import Entities.PessoaG;
import Entities.Pessoas;

public class ListaPessoas {

	Set<Pessoas> nomes = new TreeSet<>();
	Set<PessoaG> generos=new TreeSet<>();
	public void inserirLista(String nome) {
		nomes.add(new Pessoas(nome));
		
	}
    public void exibirLista() {
    	System.out.println("Lista de Nomes:");
        for (Pessoas pessoa : nomes) {
            System.out.println(pessoa.getNome());
        }
        
        System.out.println("\n");

    }
	public void inserirListaG(String nome, String genero) {
		generos.add(new PessoaG(nome,genero));

		
	}
    public void exibirListaG() {
        StringBuilder masc = new StringBuilder("Lista Masculina:\n");
        StringBuilder fem = new StringBuilder("\nLista Feminina:\n");
        
        for (PessoaG pessoaG : generos) {
            if (pessoaG.getGenero().equalsIgnoreCase("M")) {
                masc.append(pessoaG.getNome()).append("\n");
            } else if (pessoaG.getGenero().equalsIgnoreCase("F")) {
                fem.append(pessoaG.getNome()).append("\n");
            }
        }
        System.out.println(masc);
        System.out.println(fem);
    }
    

}
