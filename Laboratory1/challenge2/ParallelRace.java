package challenge2;
import java.util.List; /**List=coleccion*/

public class ParallelRace {
    public static int getMaxNumber(List<Integer> numbers) {
        return numbers.stream()
        .max((a, b) -> Integer.compare(a, b))
        .orElse(0); /*si esta vacia retorna 0 */
    }
}

