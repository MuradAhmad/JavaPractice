package generics;

public class Main {

    public static void main(String[] args) {

      /*  Generics<Integer, String> integerGenerics = new Generics<>(10, "String" );
        Generics<Double, Integer> doubleGenerics = new Generics<>(20.0, 10);
        Generics<String, Integer> stringGenerics = new Generics<>("I'm string", 5);

        // general generics example
        integerGenerics.showType();
        doubleGenerics.showType();
        stringGenerics.showType();

        System.out.println("example");*/

        // generics example to solve type problem (bounded type)

        GenericsExample<Integer> generoicsExample = new GenericsExample<>(5);
        System.out.println("Square : " + generoicsExample.square());


        // generics example to solve various data/object type problems

        Generics<Integer, Double> mygenerics = new Generics<>(5,3.4);
        mygenerics.showType();

        // wild card
        GenericWild<Integer> iOb = new GenericWild<>(6);
        GenericWild<Double> dOb = new GenericWild<>(-6.0);

        System.out.println(iOb.absEqual(dOb));

    }
}
