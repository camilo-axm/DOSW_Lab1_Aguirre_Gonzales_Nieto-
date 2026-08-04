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
        // Find the maximun value in the list
        int maximun = findMaximun.apply(numbers);
        // Check if the maximun is a multiple of 2
        String maximunMultiplyByTwo =
                maximun % 2 == 0 ? "YES" : "NO";

        // Function to check if the list size is even
        Function<List<Integer>, Boolean> isListSizeEven =
                list -> list.size() % 2 == 0;

        // Check if the list size is even
        boolean listSizeEven = isListSizeEven.apply(numbers);
    
        System.out.println("The maximum value is: " + maximun);
        System.out.println("Is maximun a multiple of 2?? " + maximunMultiplyByTwo);
        System.out.println("Is the list size even?? " + listSizeEven);
    }
}

