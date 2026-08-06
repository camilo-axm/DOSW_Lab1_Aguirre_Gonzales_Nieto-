package challenge2;

import java.util.List;

/** List=coleccion */

public class ParallelRace {

    public static int getMin(List<Integer> numbers) {
        return numbers.stream()
                .min((a, b) -> Integer.compare(a, b))
                .orElse(0);
    }

    public static int getTotalElements(List<Integer> numbers) {
        return numbers.size();
    }

    public static String isMaxDivisibleByTwo(List<Integer> numbers) {
    int max = getMaxnumber(numbers);
    return (max % 2 == 0) ? "Sí" : "No";
    }

}