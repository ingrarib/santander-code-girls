package dio.basecamp.collections.map;

/*
 Modelos de carros e seus respectivos consumos na estrada:
 modelo = gol - consumo = 14,4km/l
 modelo = uno - consumo = 15,6 km/l
 modelo = mobi - consumo = 16,1 km/l
 modelo = hb20 - consumo = 14,5 km/l
 modelo = kwid - consumo = 15,6 km/l
 */

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4); // não existe add, no Map é put
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares);


        System.out.println("Substitua o consumo do gol por 15,2 km/L: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais econômico e seu consumo: ");

        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet(); // retorna um Set
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry: entries) {
            if (entry.getValue().equals(consumoMaisEficiente))
                modeloMaisEficiente = entry.getKey();

        }
        System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);


        System.out.println("Exiba o modelo menos econômico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry: carrosPopulares.entrySet()) {
            if (entry.getValue().equals(consumoMenosEficiente))
                modeloMenosEficiente = entry.getKey();
        }
        System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);

        // SOMA DOS CONSUMOS
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Exiba a soma dos consumos: " + soma);

        // MÉDIA DOS CONSUMOS
        System.out.println("Exiba a média dos consumos: " + (soma/carrosPopulares.size()));

        System.out.println("Remova os modelos com o consumo igual a 15,6 km/L: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares); // conferir se removeu

        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
            put("gol", 14.4); // não existe add, no Map é put
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares);

        System.out.println("Exiba o dicionário ordenado pelo modelo: "); // quem ordena chave é o TreeMap
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2);

        // Apagar e conferir
        System.out.println("Apague o dicionário de carros: ");
        carrosPopulares.clear();
        System.out.println("Confira se o dicionário está vazio: " + carrosPopulares.isEmpty());





    }
}
