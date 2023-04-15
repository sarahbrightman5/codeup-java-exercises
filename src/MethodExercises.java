import java.util.Scanner;

public class MethodExercises {
    public static void main(String[] args) {
//        System.out.println(addition(5,6));
//        System.out.println(subtraction(7,2));
//        System.out.println(multiplication(10,2));
//        System.out.println(division(10,5));
//        getInteger(1, 10);
//        count(5);
    }
//    public static int addition(int num1, int num2){
//        return num1 +num2;
//    }
//    public static int subtraction(int num1, int num2){
//        return num1- num2;
//    }
//    public static int multiplication(int num1, int num2){
//        return num1*num2;
//    }
//    public static int division(int num1, int num2){
//        return num1/num2;
//    }
//    public static int getInteger(int min, int max){
////        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter a number between 1 and 10: ");
////        int usernum = scan.nextInt();
////        scan.nextLine();
//        if(min>0){
//            System.out.println("please enter a valid number");
////            return;
//        }
//        System.out.println(min);
//        getInteger(min-1,max+1);
//
////        int userInput = getInteger(1, 10);
//    }
//        public static void getInteger(int min, int max) {
//            System.out.println("enter number between 1 and 10");
//            Scanner input = new Scanner(System.in);
//            int usernum = input.nextInt();
//            if (usernum >= min && usernum <= max) {
//                return usernum;
//            }
//          return  getInteger(min, max);
//        }
public static int modulus(int num1, int num2) {
    int result = num1 % num2;
    return result;
}
    public static int getInteger(int min, int max) {
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        Scanner input = new Scanner(System.in);
        int userNum = input.nextInt();
        if (userNum >= min && userNum <= max) {
            return userNum;
        }
        return getInteger(min, max);
    }
    public static long getFactorial(int num){
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result*=i;
        }
        return result;
    }
    public static int getDiceSide() {
        int userChoice = getInteger(4, 20);
        return userChoice;
    }
    public static int randomNumber(int min, int max) {
        int result = (int)Math.floor(Math.random() * (max - min + 1) + min);
        return result;
    }
    public static String rollDice(int sides) {
        System.out.println("Do you want to roll the dice? [y/N]");
        Scanner input = new Scanner(System.in);
        String userChoice = input.nextLine();
        if (userChoice.equalsIgnoreCase("y")) {
            int result1 = randomNumber(1, sides);
            int result2 = randomNumber(1, sides);
            return "The first dice rolled on " + result1 + ". The second dice rolled on " + result2 + ". The total is " + (result1 + result2) + "." ;
        }
        return "Fine. Go away.";
    }

}
