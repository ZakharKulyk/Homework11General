package ua.goit.polymorpism.Module11.Homework11General.Homework11Task1.Homework11Task5;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamConcatenator {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3");
        Stream<String> stream1 = Stream.of("a", "b", "c","6");

        Stream<String> result = zip(stream, stream1);
        System.out.println(result.toList());



    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){

       List<T>text = first.collect(Collectors.toList());
       List<T>text1 = second.collect(Collectors.toList());

       int mainValueForLoop =0;
        List<T>result = new ArrayList<>();

       if(text.size()>text1.size()){
           mainValueForLoop = text1.size();
       }else {
           mainValueForLoop = text.size();
       }

       for(int i =0; i<mainValueForLoop; i++){
           result.add(text.get(i));
           result.add(text1.get(i));
       }

       return  result.stream();

    }
}
