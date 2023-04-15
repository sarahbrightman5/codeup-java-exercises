import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.Arrays;

public class ArrayExercises {
    public static Person[] addPerson(Person[] personArray, Person newPerson){
        Person[] newPersonArray = Arrays.copyOf(personArray, personArray.length +1);
        newPersonArray[newPersonArray.length-1]= newPerson;
        return newPersonArray;
    }

    public static void main(String[] args) {
        Person sarah= new Person("Sarah");
        Person graciela = new Person("Graciela");
        Person brightman = new Person("Brightman");

        Person[] person = {sarah, graciela, brightman};
        for(Person personloop : person){
            System.out.println(personloop.getName());
        }
    Person sunshine = new Person("Sunshine");
        Person[] newPersonArray = ArrayExercises.addPerson(person,sunshine);
        for(Person persons: newPersonArray){
            System.out.println(persons.getName());
        }
        String[] adjectives = {"adorable","adorable","colorful","meaningless","clumsy","bewildered","friendly","hilarious","lively","zealous","grotesque"};
        String[] nouns ={"government","world", "bananas", "men", "Japan", "family", "moonlight", "mother-in-law", "childhood", "google"};

//        String noun = ServerNameGenerator.randomString(noun);

        System.out.println(ServerNameGenerator.randomString(adjectives));
        System.out.println(ServerNameGenerator.randomString(nouns));



    }
}
