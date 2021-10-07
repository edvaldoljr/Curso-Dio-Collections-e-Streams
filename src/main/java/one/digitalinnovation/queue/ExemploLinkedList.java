package one.digitalinnovation.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {
    public static void main(String[] args) {

        //Declarando e instanciando a nossa Queue;
        Queue<String> FilaDeBanco = new LinkedList<>();

        FilaDeBanco.add("Patricia");
        FilaDeBanco.add("Roberto");
        FilaDeBanco.add("Flavio");
        FilaDeBanco.add("Pamela");
        FilaDeBanco.add("Anderson");

        System.out.println(FilaDeBanco);

        //Método poll retorna e remove o primeiro item da fila, caso a fila estiver vazia irá retornar null;
        String ClienteASerAtendido = FilaDeBanco.poll();

        System.out.println("--> " + ClienteASerAtendido);

        System.out.println(FilaDeBanco);

        //FilaDeBanco.clear();

        //Método peek vai apenas nos retorna quem é o primeiro da fila, mas não irá remover, caso a fila estiver vazia irá retornar null;
        String PrimeiroCliente = FilaDeBanco.peek();

        System.out.println("--> " + PrimeiroCliente);

        System.out.println(FilaDeBanco);

        //FilaDeBanco.clear();

        //Método element irá trazer o primeiro elemento da fila, mas caso esteja vazia não irá trazer null e sim  um erro de exceção NoSuchElementException;
        String PrimeiroClienteOuErro = FilaDeBanco.element();

        System.out.println("--> " + PrimeiroClienteOuErro);

        System.out.println(FilaDeBanco);

        int i = 0;

        // mostrando os "n" clientes da fila (usando for-each);
        for (String cliente: FilaDeBanco){
            System.out.println("--> " + cliente);

        }

        // mostrando os "n" clientes da fila (com iterator);
        System.out.printf("\nPercorrendo o ArrayList (usando iterator)\n");
        Iterator<String> iteratorFilaDeBanco = FilaDeBanco.iterator();
        while (iteratorFilaDeBanco.hasNext()) {
            System.out.println("--> " + iteratorFilaDeBanco.next());
        }

        //Quantos elementos a nossa fila tem;
        System.out.println(FilaDeBanco.size());

        //Verificar se a lista esta vazia False;
        System.out.println(FilaDeBanco.isEmpty());

        boolean temAnderson = FilaDeBanco.contains("Flavio");
        System.out.println(temAnderson);

        FilaDeBanco.clear();

        //Verificar se a lista esta vazia True;
        System.out.println(FilaDeBanco.isEmpty());

    }
}
