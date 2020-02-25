import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        // Predicate represents a boolean value function of one value


        System.out.println("without Predicate");
        System.out.println(isPhoneNumberValid("0358453319542"));
        System.out.println(isPhoneNumberValid("12367893"));
        System.out.println("with Predicate");
        System.out.println(isPhoneNumberValidPredicate.test("0358453319542"));
        System.out.println(isPhoneNumberValidPredicate.test("03584539542"));
        System.out.println(isPhoneNumberValidPredicate.test("0453319542"));



    }

    static boolean isPhoneNumberValid(String phoneNumber){


        return phoneNumber.startsWith("035") &&phoneNumber.length() ==13;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("0358") && phoneNumber.length()==13;

}
