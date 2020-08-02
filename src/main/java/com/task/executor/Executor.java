package main.java.com.task.executor;

import main.java.com.task.family.TitleComparator;
import main.java.com.task.family.Family;
import main.java.com.task.family.NameOfEmblemComparator;
import main.java.com.task.number.NumberAddition;
import main.java.com.task.duplicates.DuplicatesRemove;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
public class Executor {
    public static void startProgram() throws IOException {
        DuplicatesRemove.duplicatesRemoving();
        Executor.familyRealization();
    }

    public static void familyRealization() {
        Map<Family, Integer> myFamilyMap = new TreeMap<>();
        myFamilyMap.put(new Family("Dan", "Freeman", "Beer", 42), 0);
        myFamilyMap.put(new Family("Leroy", "Foul", "Jenkins", 29), 0);
        myFamilyMap.put(new Family("Baal", "Daemon", "==Skull==", 999), 0);
        myFamilyMap.put(new Family("Zero", "TreasureHunter", "Knife", 13), 0);
        myFamilyMap.put(new Family("Ironman", "Hero", "====Steel====", 13), 0);
        myFamilyMap.put(new Family("Artur", "King", "=====Stone=====", 7), 0);
        myFamilyMap.put(new Family("Axton", "Sniper", "=======Ghost=======", 39), 0);
        myFamilyMap.put(new Family("Salvador", "Gunzerker", "========Shotgun========", 420), 0);
        myFamilyMap.put(new Family("Maya", "Syrena", "Cry", 69), 0);
        myFamilyMap.put(new Family("Cat", "Justcat", "Mr", 1259), 0);

        System.out.println('\n' + "Collection sorted in natural order by name: ");
        myFamilyMap.forEach((Family, Integer) -> System.out.println(Family));

        Map<Family, Integer> myFamilyReverseMap = new TreeMap<>(Collections.reverseOrder(new TitleComparator()));
        myFamilyReverseMap.putAll(myFamilyMap);

        System.out.println('\n' + "Collection sorted in reverse order by Title: ");
        for (Map.Entry<Family, Integer> entry : myFamilyReverseMap.entrySet()) {
            Family key = entry.getKey();
            System.out.println(key);
        }
        System.out.println('\n' + "Collection sorted in natural order by emblem length: ");

        Map<Family, Integer> emblemsSortingMap = new TreeMap<>(new NameOfEmblemComparator());
        emblemsSortingMap.putAll(myFamilyMap);

        for (Map.Entry<Family, Integer> entry : emblemsSortingMap.entrySet()) {
            Family key = entry.getKey();
            System.out.println(key);
        }
    }
}

