package generics;

import java.util.HashMap;
import java.util.stream.Stream;

public class Generics<T, V> {

    T type;
    V ob;

    HashMap<T, V> hashMap = new HashMap<>();

    Generics(T ob, V obj) {

        this.type = ob;
        this.ob = obj;

    }

    void showType() {
        System.out.println("Type of the data: " + type.getClass().getName());
        System.out.println("Type of the data: " + ob.getClass().getName());
    }



}

// generics bounded type
class GenericsExample<T extends Number> {

    T obj;

    GenericsExample(T a) {
        this.obj = a;
    }

    double square() {

        return obj.intValue() * obj.intValue();

    }

}

// wild card case
class GenericWild<T extends Number> {

    T num;

    GenericWild(T obj) {
        this.num = obj;
    }

    boolean absEqual(GenericWild<?> ob) {
        if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
            return true;
        return false;
    }


}


// Problem objects of various type

class myClassInteger {

    Integer i ;

    myClassInteger(Integer a){

        this.i = a;
    }

    void print() {
        System.out.println("Integer" + i);
    }
}

class myClassDouble {

    Double i ;

    myClassDouble(Double a){

        this.i = a;
    }

    void print() {
        System.out.println("Integer" + i);
    }
}

class myClassString {

    String  i ;

    myClassString(String a){

        this.i = a;
    }

    void print() {
        System.out.println("Integer" + i);
    }
}