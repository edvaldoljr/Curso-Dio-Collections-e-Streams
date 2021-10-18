package one.digitalinnovation.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {

    public static void main(String[] args) {

        TreeSet<String> treeCapitais = new TreeSet<>();

        //Monta a árvore com as capitais;
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianopolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        // Exibe todas as capitais no console;
        System.out.println(treeCapitais);

        // Retorna a primeira capital no topo da árvore;
        System.out.println(treeCapitais.first());

        // Retorna a última capital no final da árvore;
        System.out.println(treeCapitais.last());

        // Retorna a primeira capital abaixo na árvore da capital parametrizada;
        System.out.println(treeCapitais.lower("Florianopolis"));

        // Retorna a primeira capital acima na árvore da capital parametrizada;
        System.out.println(treeCapitais.higher("Florianopolis"));

        // Retorna a primeira capital no topo da árvore, removendo do set;
        System.out.println(treeCapitais.pollFirst());

        System.out.println(treeCapitais);

        // Retorna a primeira capital no final da árvore, removendo do set;
        System.out.println(treeCapitais.pollLast());

        System.out.println(treeCapitais);

        // Navega em todos os itens do iterator;
        Iterator<String > iterator = treeCapitais.iterator();

        while (iterator.hasNext()){
            System.out.println("--> " + iterator.next());
        }

        //Navega em todos os itens (usando for-each);
        for (String capital: treeCapitais){
            System.out.println(capital + " <--");
        }

        // Retorna a quantidade de itens no set;
        System.out.println(treeCapitais.size());

        // Retorna se o set está vazio ou não;
        System.out.println(treeCapitais.isEmpty());

        // Adicionando item no set;
        treeCapitais.add("Bahia");

        System.out.println(treeCapitais);

        // Removendo item do set;
        treeCapitais.remove("Bahia");

        System.out.println(treeCapitais);

    }

}
