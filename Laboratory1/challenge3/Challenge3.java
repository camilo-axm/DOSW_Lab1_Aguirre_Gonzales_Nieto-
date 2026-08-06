package challenge3;

public class Challenge3 {

    public static void main(String[] args) {

        String result = echoMessage("Echo");

        System.out.println(result);

    }

    public static String echoMessage(String message) {

        StringBuffer buffer = new StringBuffer(message);

        return buffer.reverse().toString();

    }
}