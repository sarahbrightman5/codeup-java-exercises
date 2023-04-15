import rpg.Monster;

import java.util.Arrays;

public class ArryLession {
    public static Monster[] addMonster(Monster[] monstersArray, Monster newMonster){
        Monster[] newMonsterArray = Arrays.copyOf(monstersArray, monstersArray.length + 1);
        newMonsterArray[newMonsterArray.length-1] = newMonster;
        return newMonsterArray;
    }

    public static void main(String[] args) {
//--------------------------------------independent work---------------------------------------------------------------------------------
//        String[] cats = {"Scar","Captain", "Felix","Missy","Prego"};
//        for(String cat : cats){
//            System.out.println(cat);
//        }
//
//        String[] languages = {"html", "css", "javascript", "java"}
// --------------------------------------independent work---------------------------------------------------------------------------------

   Monster orc = new Monster("Orc", 13, 15, 9);
   Monster ogre = new Monster("Oger", 13, 15, 9);
   Monster dragon = new Monster("Dragon", 13, 15, 9);
   Monster[] monsters = {orc, ogre, dragon};
   for(Monster monsterloop : monsters){
       System.out.println(monsterloop.getName());
   }

        Monster cloaker = new Monster("Cloaker", 14, 78, 10);
        Monster[] newMonsterArray = ArryLession.addMonster(monsters, cloaker);
        for (Monster monster : newMonsterArray){
            System.out.println(monster.getName());
        }

    }
//    public static Monster[] addMonster(Monster[] monsterArray, Monster newMonster){
//        Monster[] newMonsterArray = new Monster[monsterArray.length +1] = newMonster;
//        return newMonsterArray;
//    }





}
