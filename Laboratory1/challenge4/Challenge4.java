package challenge4;

import java.util.Hashtable;
import java.util.Map;

public class Challenge4 {

    public static void main(String[] args) {

        Map<String, Integer> hashTableResult = buildHashTable();

        hashTableResult.forEach((key, value) ->
                System.out.println("Key: " + key + " | Value: " + value));
    }

    public static Map<String, Integer> buildHashTable() {

        Hashtable<String, Integer> result = new Hashtable<>();

        result.put("silver", 8);
        result.put("ruby", 4);
        result.put("gold", 12);
        result.put("emerald", 6);

        return result;
    }
}