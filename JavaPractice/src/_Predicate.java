

public class _Predicate {

    public static void main(String[] args) {

        // Predicate represents a boolean value function of one value

        System.out.println(isPhoneNumberValid("0358453319542"));
        System.out.println(isPhoneNumberValid("12367893"));


    }

    static boolean isPhoneNumberValid(String phoneNumber){


        return phoneNumber.startsWith("035") &&phoneNumber.length() ==13;
    }

}
