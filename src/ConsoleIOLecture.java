
import java.util.Scanner;

public class ConsoleIOLecture {

    public static void main(String[] args) {
        String cohort = "Bigfoot";
        System.out.printf("Hello, %s.", cohort);
        float it = 123.456F;
        System.out.printf("the num %-11.2f%n", it);

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter word");
        String userin = scanner.next();
        System.out.printf("ur string is %s", userin);
    }
}
