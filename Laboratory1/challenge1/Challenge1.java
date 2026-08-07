package challenge1;

import java.util.Arrays;
import java.util.List;

public class Challenge1 {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student(
                        "Camilo Aguirre",
                        22,
                        "camilo.aguirre@escuelaing.edu.co",
                        7
                ),
                new Student(
                        "Sara Sofia Gonzalez",
                        21,
                        "sara.gonzalez-g@escuelaing.edu.co",
                        7
                ),
                new Student(
                        "Juan David Nieto",
                        21,
                        "juan.nieto@escuelaing.edu.co",
                        7
                )
        );

        System.out.println(WelcomeMessage.createMessage(students));
    }
}
