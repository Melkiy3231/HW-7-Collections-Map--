package main.java.com.task.family;

import java.util.Comparator;

public class TitleComparator implements Comparator<Family> {

    @Override
    public int compare(Family family1, Family family2) {
        return family1.getTitle().compareTo(family2.getTitle());
    }
}