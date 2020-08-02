package main.java.com.task.duplicates;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class DuplicatesRemove {
    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void duplicatesRemoving() throws IOException {
        System.out.println("Please, enter numeric values with a comma: ");
        String stringSet = bufferedReader.readLine();
        Arrays.stream(
                stringSet.replaceAll(" ", "")
                        .split(",")
        ).collect(Collectors.toSet())
                .forEach(e -> System.out.print(e + " "));
    }
}