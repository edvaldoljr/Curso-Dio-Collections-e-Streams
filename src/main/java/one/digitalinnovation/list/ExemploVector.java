package one.digitalinnovation.list;

import java.util.List;
import java.util.Vector;

public class ExemploVector {

    public static void main(String[] args) {
        List<String> esportes = new Vector<>();

        //Adicionando 4 esportes ao nosso Vector;
        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tenis de mesa");
        esportes.add("Handebol");

        //Alterando o valor da posição 3 do Vector;
        esportes.set(2,"Ping Pong");

        //Removendo o index 2 do Vector;
        esportes.remove(2);

        //Removendo um obejeto do indes pelo nome;
        esportes.remove("Basquetebol");

        //Retornando o mprimerio index do Vector;
        System.out.println(esportes.get(0));

        //Navegando dentro do nosso Vector espostes;
        for (String esporte: esportes) {
            System.out.println(esporte);
        }
    }
}
