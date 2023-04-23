package util;

import util.*;

public class InputTest {

    public static void main(String[] args) {
        Input input = new Input();
//        System.out.println(input.getString());
//        System.out.println(input.getString("Please enter a word of your choice:"));
//        String userChoice = input.getString("Would you like to continue?");
//   while (input.yesNo(userChoice)){
//       userChoice = input.getString("Would you like to continue?");
//   }
//        System.out.println(input.yesNo());
//        System.out.println(input.getInt(1, 100));
//        System.out.println(input.getDouble(1, 100));

        // System.out.println(input.getDouble());
        // input.getGhost();
        // System.out.println(input.getString());
        int myNum = input.getInt();
        System.out.println(myNum);
    }
}