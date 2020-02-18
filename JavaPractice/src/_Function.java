import javax.sound.midi.Soundbank;
import java.util.function.Function;

public class _Function {


    public static void main(String[] args){

        int increment = incrementByOne(1);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);

        Function<Integer, Integer> addByOneAndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(addByOneAndThenMultiplyBy10.apply(4));


    }

    static Function<Integer,Integer> incrementByOneFunction =
            number -> number +1;

    static Function<Integer,Integer> multiplyBy10Function =
            number -> number * 10;

    static int incrementByOne(int number){
        return number + 1;
    }

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy){
        return (number + 1) * numToMultiplyBy;
    }

}
