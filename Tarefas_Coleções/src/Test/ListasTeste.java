package Test;

import Models.ListaPessoas;

public class ListasTeste {

	public static void main(String[] args) {
		ListaPessoas lista = new ListaPessoas();
		
		lista.inserirLista("Murilo");
        lista.inserirLista("Carlos");
        lista.inserirLista("Ana");
        lista.inserirLista("Bruno");
        lista.inserirLista("Daniel");
        lista.inserirLista("Eduarda");
        lista.inserirLista("Fernando");
        lista.inserirLista("Gabriela");
        lista.inserirLista("Hugo");
        lista.inserirLista("Isabela");
        lista.inserirLista("João");
        lista.inserirLista("Karen");
        lista.inserirLista("Lucas");
        lista.inserirLista("Mariana");
        lista.inserirLista("Nathalia");
        lista.inserirLista("Otávio");
        lista.inserirLista("Paula");
        lista.inserirLista("Ricardo");
        lista.inserirLista("Sofia");
        lista.inserirListaG("Julia", "F");
        lista.inserirListaG("Mariana", "F");
        lista.inserirListaG("Fernanda", "F");
        lista.inserirListaG("Camila", "F");
        lista.inserirListaG("Beatriz", "F");

        lista.inserirListaG("Lucas", "M");
        lista.inserirListaG("Gabriel", "M");
        lista.inserirListaG("Matheus", "M");
        lista.inserirListaG("Rafael", "M");
        lista.inserirListaG("Bruno", "M");
        
        lista.exibirLista();
        lista.exibirListaG();
        

	}

}
