package ua.goit.polymorpism.Module11.Homework11General.Homework11Task1.Homework11Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortFromZToA {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        List<String>namesWithUpperCase = new ArrayList<>();

        names.add("Roman");
        names.add("Julia");
        names.add("Billy");
        names.add("Dog");
        names.add("Cat");
        names.add("Zakhar");

        for(String name : names){
            namesWithUpperCase.add(name.toUpperCase());
        }


        Collections.sort(namesWithUpperCase,(String o1, String o2)->(o2.length()-o1.length()));
        System.out.println(namesWithUpperCase
        );

    }
}
