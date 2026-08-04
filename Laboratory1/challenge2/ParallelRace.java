package challenge2;

import java.util.List;
import java.util.function.Function;

public class ParallelRace {
    public static void main(String[] args) {
        
       List<Integer> numbers = List.of(10,5,20,15);

       Function<List<Integer>, Integer> findMaximun= 
                list -> list.stream()
                            .max(Integer::compareTo)
                            .orElseThrow();
        int maximun = findMaximun.apply(numbers);
        String maximunMultiplyByTwo =
                maximun % 2 == 0 ? "YES" : "NO";
    
        System.out.println("The maximum value is: " + maximun);
        System.out.println("Is maximun a multiple of 2?? " + maximunMultiplyByTwo);
    }
}

