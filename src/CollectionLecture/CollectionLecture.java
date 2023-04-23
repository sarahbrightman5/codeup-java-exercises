package CollectionLecture;
import rpg.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

public class CollectionLecture {
    public static void main(String[] args) {
        Monster orc = new Monster("Orc", 13, 15, 9);
        Monster ogre = new Monster("Ogre", 11, 59, 13);
        Monster blueDragon = new Monster("Blue Dragon", 19, 225, 23);

        ArrayList<Monster> monsterList = new ArrayList<>();
        monsterList.add(orc);
        monsterList.add(ogre);
        monsterList.add(blueDragon);

        for(Monster monster: monsterList){
            System.out.println(monster.getName());

        }
        System.out.println(monsterList.size());
        System.out.println(monsterList.get(1).getName());

        HashMap<String, Integer> careerWins = new HashMap<>();
        careerWins.put("Gregg Popovich",1366);
        careerWins.put("Don Nelson",1335);
        careerWins.put("Lenny Wilkend",1332);

        System.out.println(careerWins.get("Gregg Popovich"));

        careerWins.replace("Gregg Popovich",1367);

        System.out.println(careerWins.get("Gregg Popovich"));

//        HashMap<String, Monster> monsterMap= new HashMap<>();

       Map<String, Monster> monsterMap = Map.ofEntries(
                entry("Orc",orc),
                entry("Blue Dragon", blueDragon),
               entry("Ogre",ogre)
        );

        monsterMap.forEach((name, monster)->{
            System.out.printf("%s has %d hit points.%n ", name, monster.getHitPoints());
        });


    }
}
