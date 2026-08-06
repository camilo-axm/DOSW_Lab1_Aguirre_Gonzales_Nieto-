package challenge6;

import java.util.HashMap;
import java.util.Map;

public class Challenge6 {

    static Map<String, Runnable> commands = new HashMap<>();

    static {
        commands.put("JOKE", () -> System.out.println("Why did the RAM break up with the CPU? It needed space."));
        commands.put("SHOUT", () -> System.out.println("STACK OVERFLOW ALERT!"));
        commands.put("WHISPER", () -> System.out.println("Shhh... the bugs are sleeping."));
        commands.put("ANALYZE", () -> System.out.println("Processing data... result: You are amazing at programming!"));
    }

    public static void main(String[] args) {
        executeCommand("JOKE");
        executeCommand("SHOUT");
        executeCommand("WHISPER");
        executeCommand("ANALYZE");
        executeCommand("PARTY");
    }

    public static void executeCommand(String command) {
        switch (command) {
            case "JOKE":
            case "SHOUT":
            case "WHISPER":
            case "ANALYZE":
                commands.get(command).run();
                break;
            default:
                System.out.println("Command not recognized.");
        }
    }
}