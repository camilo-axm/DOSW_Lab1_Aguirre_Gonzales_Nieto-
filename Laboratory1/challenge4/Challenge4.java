package challenge4;

import java.util.*;
import java.util.stream.Collectors;

public class Challenge4 {

    public static void main(String[] args) {

        List<Map.Entry<String, Integer>> pairsHashMap = List.of(
                Map.entry("gold", 5),
                Map.entry("silver", 3),
                Map.entry("gold", 7),
                Map.entry("diamond", 10));

        Map<String, Integer> hashMapResult = buildHashMap(pairsHashMap);
        Map<String, Integer> hashTableResult = buildHashTable();

        Map<String, Integer> merged = mergeMaps(hashMapResult, hashTableResult);

        merged.forEach((key, value) -> System.out.println("Key: " + key + " | Value: " + value));
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

    // Student B
    public static Map<String, Integer> buildHashTable() {

        Hashtable<String, Integer> result = new Hashtable<>();

        result.put("silver", 8);
        result.put("ruby", 4);
        result.put("gold", 12);
        result.put("emerald", 6);

        return result;
    }

    // Merge final
    public static Map<String, Integer> mergeMaps(Map<String, Integer> hashMap,
            Map<String, Integer> hashTable) {

        Map<String, Integer> combined = new HashMap<>();

        // Primero HashMap
        combined.putAll(hashMap);

        // Luego Hashtable (tiene prioridad)
        combined.putAll(hashTable);

        return combined.entrySet()
                .stream()
                .map(entry -> Map.entry(entry.getKey().toUpperCase(), entry.getValue()))
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> newValue,
                        LinkedHashMap::new));
    }
}