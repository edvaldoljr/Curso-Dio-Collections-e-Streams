package one.digitalinnovation.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet<Integer> seguenciaNumerica = new LinkedHashSet<>();

        // Adiciona os numeros no set;
        seguenciaNumerica.add(1);
        seguenciaNumerica.add(2);
        seguenciaNumerica.add(4);
        seguenciaNumerica.add(8);
        seguenciaNumerica.add(16);

        System.out.println(seguenciaNumerica);

        // Remove o numero do set;
        seguenciaNumerica.remove(4);

        System.out.println(seguenciaNumerica);

        // Retorna a quantidade de itens no set;
        System.out.println(seguenciaNumerica.size());

        // Navega em todos os itens (com iterator);
        Iterator<Integer>iterator = seguenciaNumerica.iterator();

        while (iterator.hasNext()){
            System.out.println("--> " + iterator.next());
        }

        // Navega em todos os itens (usando for-each);
        for (Integer numero: seguenciaNumerica){
            System.out.println(numero + " <--");
        }

        seguenciaNumerica.clear();

        //Retorna se o set está vazio ou não;
        System.out.println(seguenciaNumerica.isEmpty());

    }
}
