import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        System.out.println("start a convo with bob");
        Scanner scan = new Scanner(System.in);
        String userin = scan.nextLine();
        while(!userin.isBlank()) {
            if (userin.endsWith("?")) {
                System.out.println("sure");
            } else if (userin.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userin.isBlank()) {
                System.out.println("Fine. Be that way!");
                break;
            } else {
                System.out.println("Whatever");

            }
            userin = scan.nextLine();
        }
    }
}
