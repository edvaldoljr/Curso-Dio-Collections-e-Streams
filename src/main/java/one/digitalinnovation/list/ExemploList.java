package one.digitalinnovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>(); // Instanciando a nossa List;

        // Método add adiciona itens na nossa lista;
        nomes.add("Edvaldo");
        nomes.add("Priscila");
        nomes.add("Denise");
        nomes.add("Maria");
        nomes.add("Joao");

        System.out.println(nomes);

        // Método set atualiza a informação da lista no índice desejado;nomes.set(2, "Juju");
        nomes.set(2, "Juju");

        System.out.println(nomes);

        // Ordena a lista em ordem alfabética;
        Collections.sort(nomes);

        System.out.println(nomes);

        nomes.set(2, "Weslley");

        System.out.println(nomes);

        // Método remove por índice serve para remover o índice na posição desejada da lista;
        nomes.remove(4);

        Collections.sort(nomes);

        System.out.println(nomes);

        // Remove por objeto, aqui passamos o objeto em que desejamos remover da lista;
        nomes.remove("Maria");

        System.out.println(nomes);

        // Método get vai salvar em, uma variável o valor do índice do array que desejarmos;
        String nome = nomes.get(2);

        System.out.println(nome);

        // Método indexOf vai nos mostrar em qual index está o nosso objeto;
        int posicao = nomes.indexOf("Weslley");

        System.out.println(posicao);

        //Metodo size vai nos mostrar quantos elementos temos dentro da nossa lista;
        int tamanho = nomes.size();

        System.out.println(tamanho);

        // Método contains serve para verificar se dentro, da lista tem tal objeto;
        boolean temAnderson = nomes.contains("Andeson");

        System.out.println(temAnderson); // false;

        boolean temWeslley = nomes.contains("Weslley");

        System.out.println(temWeslley); // true;

        // Método isEmpty serve para verificar se a nossa lista está vazia ou não;
        boolean estaVazia = nomes.isEmpty();

        System.out.println(estaVazia); // false;

        // mostrando os "n" nomes da lista (usando for-each);
        for (String varrerLista: nomes){

            System.out.println("---> " + varrerLista);
        }

        // mostrando os "n" nomes da lista (com iterator);
        Iterator<String> iterator = nomes.iterator();

        // iterator.hasNext vai nos retornar um boolean true ou false para cada vez que existir mais um item na lista, só retornará false quando ele já tiver interado todas as posições da lista;
        while (iterator.hasNext()){

            // iterator.next vai nos retornar o objeto que esta sendo interado na linha acima no interator.hasNext;
            System.out.println(iterator.next() + " <--");
        }

        // Método clear serve para limpar tudo que tem dentro da nossa lista;
        nomes.clear();

        // Verificar se a nossa lista está vazia;
        estaVazia = nomes.isEmpty();

        System.out.println(estaVazia); // true;

    }
}
