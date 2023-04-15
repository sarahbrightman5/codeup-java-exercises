package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;


    public String getString(){
        System.out.println("enter a string");
        return scanner.nextLine();
    }
    public boolean yesNo(){
        System.out.println("would you like to contine [y/n]");
        String userChoice = scanner.nextLine();
        return userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes");
    }

//    public int getInt(int min, int max){
//        System.out.println("enter number between " +min+ " and "  +max+ ".");
//        int userNum = scanner.nextInt();
//        if (userNum>= min&& max){
//
//        }
//    }
    public Input() {
        this.scanner = new Scanner(System.in);
    }











}
