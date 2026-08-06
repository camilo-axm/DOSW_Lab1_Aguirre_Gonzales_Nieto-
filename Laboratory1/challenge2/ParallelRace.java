package challenge2;
import java.util.List; /*List=coleccion*/

public class ParallelRace {
    public static int getMaxNumber(List<Integer> numbersMax) {
        return numbers.stream()
        .max((a, b) -> Integer.compare(a, b))
        .orElse(0); /*if is empty return  0 */
    }
    /* get size of the numbers max of list*/
    public static int getSizeMax (ist<Integer> numbersMax){
    return numbersMax.size();
    }
    public static String isSizeEven(List<Integer> numbersMax) {
    return (getSizeMax(numbers) % 2 == 0) ? "Sí" : "No";
    }
}

