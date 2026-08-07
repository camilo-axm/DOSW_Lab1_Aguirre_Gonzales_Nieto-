package challenge4;

import java.util.*;
import java.util.stream.Collectors;

public class Challenge4 {

public static void main(String[] args) {
    List<Map.Entry<String, Integer>> pairsHashMap = List.of(
        Map.entry("gold", 5),
        Map.entry("silver", 3),
        Map.entry("gold", 7),
        Map.entry("diamond", 10)
    );


    Map<String, Integer> hashMapResult = buildHashMap(pairsHashMap);

    Map<String, Integer> hashTableResult = buildHashTable();

    Map<String, Integer> merged = mergeMaps(hashMapResult, hashTableResult);

    merged.forEach((key, value) -> System.out.println("Key: " + key + " | Value: " + value));
}

public static Map<String, Integer> buildHashMap(List<Map.Entry<String, Integer>> pairs ){
    HashMap<String, Integer> result = new HashMap<>();
    
    pairs.stream().forEach(entry -> {
        if(!result.containsKey(entry.getKey())){
            result.put(entry.getKey(), entry.getValue());
        }
    });

    return result;
}

public static Map<String, Integer> buildHashTable(){
    Hashtable<String, Integer> result = new Hashtable<>();

    return result;
}

public static Map<String, Integer> mergeMaps(Map<String, Integer> hashMap, Map<String, Integer> hashTable) {
    Map<String, Integer> combined = new HashMap<>();
    combined.putAll(hashMap);
    combined.putAll(hashTable);

    return combined.entrySet().stream()
        .map(entry -> Map.entry(entry.getKey().toUpperCase(), entry.getValue()))
        .sorted((entry1, entry2) -> entry1.getKey().compareTo(entry2.getKey()))
        .collect(Collectors.toMap(
            entry -> entry.getKey(),
            entry -> entry.getValue(),
            (oldValue, newValue) -> newValue,
            LinkedHashMap::new
        ));
}

}
