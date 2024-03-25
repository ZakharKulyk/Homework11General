package ua.goit.polymorpism.Module11.Homework11General.Homework11Task1.Homework11Task3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortNumbers {
    public static void main(String[] args) {
        String arr[] = {"1, 2, 0", "4, 5"};
       String arrWithSortedNumbers= "\" "+Arrays.stream(arr)
                        .flatMap( s ->Arrays.stream(s.split(",\\s*")))
                        .mapToInt(Integer::parseInt)
                        .sorted()
                        .mapToObj(String::valueOf)
               .collect(Collectors.joining(", "))
               + "\"";

        System.out.println(arrWithSortedNumbers);










    }
}
