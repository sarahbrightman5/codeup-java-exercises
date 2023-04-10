import java.util.Scanner;
public class scannerPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("whats your name");
        String name = scan.nextLine();
        System.out.printf("ur name is %s", name);
    }
}
