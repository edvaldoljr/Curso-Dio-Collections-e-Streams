package one.digitalinnovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>(); // Instanciando nosso List;

        nomes.add("Edvaldo"); // Metodo add adiciona itens na nossa lista;
        nomes.add("Priscila");
        nomes.add("Denise");
        nomes.add("Maria");
        nomes.add("Joao");

        System.out.println(nomes); // [Edvaldo, Priscila, Denise, Maria, Joao];

        nomes.set(2, "Juju"); // Método set atualiza a informação da lista no indice desejado;

        System.out.println(nomes); // [Edvaldo, Priscila, Juju, Maria, Joao];

        Collections.sort(nomes); // Ordena a lista em ordem alfabética;

        System.out.println(nomes); // [Edvaldo, Joao, Juju, Maria, Priscila];

        nomes.set(2, "Weslley");

        System.out.println(nomes); // [Edvaldo, Joao, Weslley, Maria, Priscila];

        nomes.remove(4); // Método remove por index serve para remover o index na posição desejada da lista;

        Collections.sort(nomes);

        System.out.println(nomes); //[ Edvaldo, Joao, Maria, Weslley];

        nomes.remove("Maria"); // Remove por objeto, aqui passamos o objeto em que desejamos remover da lista;

        System.out.println(nomes); // [Edvaldo, Joao, Weslley];

        String nome = nomes.get(2); // Método get vai salvar em, uma variável o valor do index do array que desejarmos;

        System.out.println(nome); // Weslley;

        int posicao = nomes.indexOf("Weslley"); // Método indexOf vai nos mostrar em qual index está o nosso objeto;

        System.out.println(posicao);

        int tamanho = nomes.size(); //Metodo size vai nos mostrar quantos elementos temos dentro da nossa lista;

        System.out.println(tamanho);

        boolean temAnderson = nomes.contains("Andeson"); // Método contains serve para verificar se dentro, da lista tem tal objeto;

        System.out.println(temAnderson); // false;

        boolean temWeslley = nomes.contains("Weslley");

        System.out.println(temWeslley); // true;

        boolean estaVazia = nomes.isEmpty(); // Método isEmpty serve para verificar se a nossa lista está vazia ou não;

        System.out.println(estaVazia); // false;

        // Utilizando o for de uma maneira imperativa para vermos todos os itens da lista;
        for (String varrerLista: nomes){

            System.out.println("---> " + varrerLista);
        }

        Iterator<String> iterator = nomes.iterator();  // Método iterator serve também parar vermos a nossa lista e podemos navegar na lista através de um while;

        while (iterator.hasNext()){ // iterator.hasNext vai nos retornar um boolean true ou false para cada vez que existir mais um item na lista, só retornará false quando ele já tiver interado todas as posições da lista;

            System.out.println(iterator.next() + " <--"); // iterator.next vai nos retornar o objeto que esta sendo interado na linha acima no interator.hasNext;
        }

        nomes.clear(); // Método clear serve para limpar tudo que tem dentro da nossa lista;

        estaVazia = nomes.isEmpty(); // Verificar se a nossa lista está vazia;

        System.out.println(estaVazia); // true;

    }
}
