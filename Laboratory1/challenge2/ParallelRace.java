package challenge2;

import java.util.List;

/** List=coleccion */

public class ParallelRace {

    public static int getMin(List<Integer> numbersMin) {
        return numbersMin.stream()
                .min((a, b) -> Integer.compare(a, b))
                .orElse(0);
    }

    public static int getTotalElements(List<Integer> numbersMin) {
        return numbersMin.size();
    }
    /*Verify is the number is multiple of two*/
    public static String isMaxDivisibleByTwo(List<Integer> numbers) {
    int max = getMaxnumber(numbers);
    return (max % 2 == 0) ? "Sí" : "No";
    


}
