package challenge6;

import java.util.HashMap;
import java.util.Map;

public class Challenge6 {

    static Map<String, Runnable> commands = new HashMap<>();

    static {
        // Student A
        commands.put("GREET", () -> System.out.println("Greetings, traveler of time and code!"));
        commands.put("FAREWELL", () -> System.out.println("May the bits be with you until the next mission."));
        commands.put("SING", () -> System.out.println("01010101"));
        commands.put("DANCE", () -> System.out.println("Spinning in party mode."));

        // Student B
        commands.put("JOKE", () -> System.out.println("Why did the RAM break up with the CPU? It needed space."));
        commands.put("SHOUT", () -> System.out.println("STACK OVERFLOW ALERT!"));
        commands.put("WHISPER", () -> System.out.println("Shhh... the bugs are sleeping."));
        commands.put("ANALYZE", () -> System.out.println("Processing data... result: You are amazing at programming!"));
    }

    public static void main(String[] args) {
        // Student A
        executeCommand("GREET");
        executeCommand("FAREWELL");
        executeCommand("SING");
        executeCommand("DANCE");

        // Student B
        executeCommand("JOKE");
        executeCommand("SHOUT");
        executeCommand("WHISPER");
        executeCommand("ANALYZE");

        // Invalid command
        executeCommand("PARTY");
    }

    public static void executeCommand(String command) {
        switch (command) {
            case "GREET":
            case "FAREWELL":
            case "SING":
            case "DANCE":
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