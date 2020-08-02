package main.java.com.task.family;

import java.util.Comparator;

public class NameOfEmblemComparator implements Comparator<Family> {
    @Override
    public int compare(Family family1, Family family2) {
        return family1.getNameOfEmblem().length() - family2.getNameOfEmblem().length();
    }
}