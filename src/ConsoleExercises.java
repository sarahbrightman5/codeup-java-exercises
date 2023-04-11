import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("the input of pi is approximately %.2f %n",pi);
        Scanner scan = new Scanner(System.in);
//        scan.useDelimiter("\n");
        System.out.print("enter a integer ");
        int integer = scan.nextInt();
        System.out.printf("ur int was %s %n", integer);
        String returnbut = scan.nextLine();
        System.out.println("enter three words ");
        String word1 = scan.next();
        String word2 =scan.next();
        String word3 = scan.next();
        String returnbutt = scan.nextLine();
        System.out.printf("word one = %s %nword two = %s %nword three = %s %n", word1, word2, word3);
        System.out.println("enter a sentence");
        String sent = scan.nextLine();
        System.out.printf("ur sentence was '%s'%n", sent);
        System.out.println("enter the length and width");
        double length = scan.nextDouble();
        double width = scan.nextDouble();
        System.out.println("the perimeter is "+((length *2)+(width*2))+ " the area is "+ (length* width));

    }
}
