package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Student> studentMap = new HashMap<>();
        studentMap.put("clowns", new Student("Sarah"));
        studentMap.get("clowns").addGrade(83);
        studentMap.get("clowns").addGrade(96);
        studentMap.get("clowns").addGrade(95);

        studentMap.put("CowboyJickJack", new Student("Gaby"));
        studentMap.get("CowboyJickJack").addGrade(90);
        studentMap.get("CowboyJickJack").addGrade(97);
        studentMap.get("CowboyJickJack").addGrade(95);

        studentMap.put("Coolguy", new Student("Zion"));
        studentMap.get("Coolguy").addGrade(89);
        studentMap.get("Coolguy").addGrade(98);
        studentMap.get("Coolguy").addGrade(99);

        studentMap.put("ripArusa", new Student("Arusa"));
        studentMap.get("ripArusa").addGrade(67);
        studentMap.get("ripArusa").addGrade(69);
        studentMap.get("ripArusa").addGrade(100);
        String choice= "n";
        System.out.println("welcome");
        System.out.printf("here are all the git hub usernames %n| clowns, CowboyJickJack, Coolguy, ripArusa | %nplease enter the username of the sudent you want more info on? %n");
        do{

        for(String user : studentMap.keySet()){

                String username = scan.nextLine();
                Student student = studentMap.get(username);
         if(student==null){
                    System.out.println("sorry that student doesn't exist");
                    System.out.println("would you like to continue [y/n]");
                    scan.nextLine();
                     System.out.println("please enter the username of the student you want more info on");

         }else{
                    System.out.println(username);
                    System.out.println(student.getName());
                    System.out.println(studentMap.get(username).getGradeAverage());
                    System.out.println("would you like to continue [y/n]");
                    String input = scan.nextLine();
                     if (input.equals("n")) {
                         System.out.println("goodbye");
                         break;
                     }
                     System.out.println("please enter the username of the student you want more info on");
                }

            }

        }while(choice.contains("y"));

       
        
    }

}
