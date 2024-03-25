package ua.goit.polymorpism.Module11.Homework11General.Homework11Task1.Homework11Task4;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;


public class LinearCongruentGenerator {
    public static void main(String[] args) {
        int a = 252149039;
        int c = 11;
        int m = (int) Math.pow(2, 48);
        Stream<Long>result = generate(a,c,m);
        result.limit(10).forEach(element-> System.out.println(element));


    }
    public static Stream<Long>generate(int a, int c, int m){
       Long seed = System.currentTimeMillis();
        UnaryOperator<Long>generator = x->(a*x+c)%m;
       return  Stream.iterate(seed, generator);

    }
}
