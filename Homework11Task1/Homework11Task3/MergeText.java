package ua.goit.polymorpism.Module11.Homework11General.Homework11Task1.Homework11Task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeText {
        public static void main(String[] args) {
            List<List<String>> text1 = Arrays.asList(Arrays.asList("Zakhar", "Roman", "Juali"), Arrays.asList("Lalya"));
            List<String>result = text1.stream()
                    .flatMap(innerList->innerList.stream())
                    .collect(Collectors.toList());

            System.out.println(result);
        }

}
