package one.digitalinnovation.map;

import java.util.Hashtable;
import java.util.Map;

public class ExemploHashTable {

    public static void main(String[] args) {

        Hashtable<String, Integer> estudantes = new Hashtable<>();

        estudantes.put("Carlos", 21);
        estudantes.put("Mariana", 33);
        estudantes.put("Rafaela", 18);
        estudantes.put("Pedro", 44);

        System.out.println(estudantes);

        estudantes.put("Pedro", 55);

        System.out.println(estudantes);

        //Remove o estudante no índice desejado;
        estudantes.remove("Pedro", 55);

        System.out.println(estudantes);

        //Recupera um estudante no índice 2;
        int idadeEstudante = estudantes.get("Mariana");

        System.out.println(idadeEstudante);

        System.out.println(estudantes.size());

        //Navegando nos registros do map (usando for-each);
        for (Map.Entry<String, Integer> entry : estudantes.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        //Navegando nos registros do map (usando for-each);
        for (String key : estudantes.keySet()){
            System.out.println(key + " -- " + estudantes.get(key));
        }

        //Verifica o tamanho do map
        System.out.println(estudantes);
    }
}
