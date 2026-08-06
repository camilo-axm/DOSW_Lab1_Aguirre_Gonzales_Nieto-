package challenge2;

import java.util.List;

/** List=coleccion */

public class ParallelRace {

    public static int getMax(List<Integer> numbers) {
        return numbers.stream()
                .max((a, b) -> Integer.compare(a, b))
                .orElse(0); /* si esta vacia retorna 0 */
    }

    public static int getMin(List<Integer> numbers) {
        return numbers.stream()
                .min((a, b) -> Integer.compare(a, b))
                .orElse(0);
    }

    public static int getTotalElements(List<Integer> numbers) {
        return numbers.size();
    }

}