package one.digitalinnovation.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {

    public static void main(String[] args) {

        Set<Double> notaAlunos = new HashSet<>();

        // Adiciona as notas no set
        notaAlunos.add(5.8);
        notaAlunos.add(9.3);
        notaAlunos.add(6.5);
        notaAlunos.add(10.0);
        notaAlunos.add(5.4);
        notaAlunos.add(7.3);
        notaAlunos.add(3.8);
        notaAlunos.add(4.0);

        System.out.println(notaAlunos);

        // Remove a nota do set
        notaAlunos.remove(3.8);

        System.out.println(notaAlunos);

        // Retorna a quantidade de itens no set;
        System.out.println(notaAlunos.size());

        // Navega em todos os itens (com iterator);
        Iterator<Double> iterator = notaAlunos.iterator();

        while (iterator.hasNext()) {
            System.out.println("--> " + iterator.next());
        }

        // Navega em todos os itens (usando for-each);
        for (Double nota: notaAlunos){
            System.out.println(nota + " <--");
        }

        //Retorna se o set está vazio ou não;
        System.out.println(notaAlunos.isEmpty());

        notaAlunos.clear();

        //Retorna se o set está vazio ou não;
        System.out.println(notaAlunos.isEmpty());
    }
}
