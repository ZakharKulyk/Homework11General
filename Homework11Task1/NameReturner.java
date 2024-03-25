package ua.goit.polymorpism.Module11.Homework11General.Homework11Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class NameReturner {

    public static int index = 0;
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Zakhar");
        names.add("Roman");
        names.add("Julia");
        names.add("Billy");
        names.add("Dog");
        names.add("Cat");

        Predicate<Integer>sortMethod = (position)->{
            if(position%2!=0){
                return  true;
            }
            else return  false;
        };
        String result = NameFilter(names, sortMethod);
        System.out.println(result);


    }

    public static String NameFilter(List<String>names, Predicate<Integer>function){
        StringBuilder stringBuilder = new StringBuilder();
        for(String name:names){
            if(function.test(index)){
               stringBuilder.append(index+"."+name + ", ");
            }
            index++;
        }
        stringBuilder.setLength(stringBuilder.length()-2);
        stringBuilder.append(".");
        return stringBuilder.toString();
    }
}
