package main.java.com.task.executor;
import main.java.com.task.family.Family;
import java.util.Comparator;
import java.util.Map;

public class MapSorter {
    public static void sortAndShowMap(Map<Integer, Family> familyMap, Comparator<Map.Entry<Integer, Family>> comparator) {
        familyMap
                .entrySet()
                .stream()
                .sorted(comparator)
                .forEach(familyEntry -> System.out.println(familyEntry.getKey() + " : " + familyEntry.getValue()));
    }
}