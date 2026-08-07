package challenge4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Challenge4 {

    public static void main(String[] args) {

        List<Map.Entry<String, Integer>> pairsHashMap = List.of(
                Map.entry("gold", 5),
                Map.entry("silver", 3),
                Map.entry("gold", 7),
                Map.entry("diamond", 10));

        Map<String, Integer> hashMapResult = buildHashMap(pairsHashMap);

        hashMapResult.forEach((key, value) -> System.out.println("Key: " + key + " | Value: " + value));
    }

    // Student A
    public static Map<String, Integer> buildHashMap(List<Map.Entry<String, Integer>> pairs) {

        HashMap<String, Integer> result = new HashMap<>();

        pairs.forEach(entry -> {
            if (!result.containsKey(entry.getKey())) {
                result.put(entry.getKey(), entry.getValue());
            }
        });

        return result;
    }

    // Método para provocar conflicto
    public static Map<String, Integer> mergeMaps(Map<String, Integer> hashMap,
            Map<String, Integer> hashTable) {

        Map<String, Integer> result = new HashMap<>();
        result.putAll(hashMap);

        return result;
    }
}