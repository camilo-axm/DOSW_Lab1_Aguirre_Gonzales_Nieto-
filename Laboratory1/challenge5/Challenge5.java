package challenge5;

import java.util.*;;

public class Challenge5 {

    public static void main(String[] args) {
        HashSet<Integer> result = hashArmy();
        System.out.println(result);
    }   

    public static HashSet<Integer> hashArmy() {
        HashSet<Integer> numbers = new HashSet<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int value = random.nextInt(30) + 1;
            numbers.add(value);
        }
        
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int current = iterator.next();
            if (current % 3 == 0) {
                iterator.remove();
            }
        }
        
        return numbers;
    }

}