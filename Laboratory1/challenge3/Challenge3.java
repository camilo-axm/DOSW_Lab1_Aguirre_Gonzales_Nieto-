package challenge3;

import java.util.stream.Stream;

public class Challenge3 {
    public static void main(String[] args) {
        String result = echoMessage("Echo");
        System.out.println(result);
    }

    public static String echoMessage(String message){
        StringBuilder builder = new StringBuilder();
        builder.append(message);

        Stream.of(1, 2).forEach(i -> {builder.append(" ").append(message);});

        return builder.toString();
    }
}
