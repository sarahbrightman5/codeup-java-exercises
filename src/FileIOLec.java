import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static jdk.internal.org.jline.utils.InfoCmp.Capability.lines;

public class FileIOLec {
    public static void main(String[] args) {
        String directory ="data";
        String fileName ="groceries.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory,fileName);
        if(Files.notExists(dataDirectory)){
            try{
                Files.createDirectories(dataDirectory);
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        if(Files.notExists(dataFile)){
            try{
                Files.createFile(dataFile);
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        //direct and file def exist neow
        List<String> groceryList = Arrays.asList("coffee", "almond milk","hot cheetos");
        System.out.println(groceryList);
        try{
            Files.write(dataFile, groceryList);
            List<String> moregroc =Arrays.asList("Peanut oil","Eggs");
            Files.write(
                    dataFile,
                    moregroc,
                    StandardOpenOption.APPEND
            );
        }catch (IOException e){
            e.printStackTrace();
        }
        //grocery list def created neow
        try{
            List<String > grocListFromFile = Files.readAllLines(dataFile);
            System.out.println(grocListFromFile);
            for(int i =  1; i<= grocListFromFile.size(); i +=1){
                System.out.println(i+": "+ grocListFromFile.get(i-1));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        boolean hasPowderedSugar = false;
        try{
            List<String> lines = Files.readAllLines(dataFile);
            for(String line: lines){
                if(line.equals("Powdered Sugar")){
                    hasPowderedSugar = true;
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        if(!hasPowderedSugar) {
            List<String> addPowSugar = Arrays.asList("Powder Sugar");
            try {
                Files.write(
                        dataFile,
                        addPowSugar,
                        StandardOpenOption.APPEND
                );
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //list has powder sugs
            try {
                List<String> lines = Files.readAllLines(dataFile);
                List<String > newLIst = new ArrayList<>();
                for(String line: lines){
                    if(line.equals("hot cheetos")){
                        newLIst.add("cheetos");
                    }else{
                        newLIst.add(line);
                    }
                }
                Files.write(dataFile, newLIst);

            }catch (IOException e){
                e.printStackTrace();
            }

    }
}
