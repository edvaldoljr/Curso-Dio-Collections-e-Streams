package one.digitalinnovation.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {

        Map<String, Integer> campeonatoMundialFifa = new HashMap<>();

        //Método put adiciona os campeões mundiais fifa no mapa;
        campeonatoMundialFifa.put("Brasil", 5);
        campeonatoMundialFifa.put("Alemanha", 4);
        campeonatoMundialFifa.put("Itália", 4);
        campeonatoMundialFifa.put("Uruguai", 2);
        campeonatoMundialFifa.put("Argentina", 2);
        campeonatoMundialFifa.put("França", 2);
        campeonatoMundialFifa.put("Inglaterra", 1);
        campeonatoMundialFifa.put("Espanha", 1);

        System.out.println(campeonatoMundialFifa);

        //Atualiza o valor para a chave Brasil;
        campeonatoMundialFifa.put("Brasil", 6);

        System.out.println(campeonatoMundialFifa);

        //Retorna a Argentina;
        System.out.println(campeonatoMundialFifa.get("Argentina"));

        //Retorna se existe ou não um campeão França;
        System.out.println(campeonatoMundialFifa.containsKey("França"));

        //Remove o campeão França;
        campeonatoMundialFifa.remove("França");

        //Retorna se existe ou não um campeão França;
        System.out.println(campeonatoMundialFifa.containsKey("França"));

        //Retorna se existe ou não alguma seleção hexa campeão;
        System.out.println(campeonatoMundialFifa.containsValue(6));

        //Retorna o tamanho do map;
        System.out.println(campeonatoMundialFifa.size());

        System.out.println(campeonatoMundialFifa);

        //Navega nos registros do map;
        for (Map.Entry<String, Integer> entry: campeonatoMundialFifa.entrySet()){
            System.out.println(entry.getKey() + "--> " + entry.getValue());
        }

        //Nvega nos registro do map;
        for (String key: campeonatoMundialFifa.keySet()){
            System.out.println(key + "-> " + campeonatoMundialFifa.get(key));
        }

        System.out.println(campeonatoMundialFifa);

        //Verifica se o map tem a chave Estados Unidos;
        System.out.println(campeonatoMundialFifa.containsKey("Estados Unidos"));

        //Verifica se o map tem o valor 5;
        System.out.println(campeonatoMundialFifa.containsValue(5));

        //Verifica o tamanho antes e depois de limpar o map;
        System.out.println(campeonatoMundialFifa.size());

        //Limpa o map;
        campeonatoMundialFifa.clear();

        System.out.println(campeonatoMundialFifa.size());

    }
}
