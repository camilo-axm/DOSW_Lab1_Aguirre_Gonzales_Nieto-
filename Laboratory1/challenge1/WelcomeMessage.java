package challenge1;

import java.util.List;
import java.util.stream.Collectors;

public class WelcomeMessage {

    public static String createMessage(List<Student> students) {

        String members = students.stream()
                .map(student -> String.format(
                        "%s, %d years old, %dth-semester student",
                        student.getName(),
                        student.getAge(),
                        student.getSemester()))
                .collect(Collectors.joining("\n"));

        String institutionalEmails = students.stream()
                .map(Student::getEmail)
                .collect(Collectors.joining("\n"));

        return "Hello and welcome!\n\n"
                + "We are:\n"
                + members
                + "\n\nOur institutional emails are:\n"
                + institutionalEmails;
    }
}