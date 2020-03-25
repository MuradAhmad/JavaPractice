import java.time.LocalDate;
import java.time.Period;

public class CustomerValidator {


    public boolean isEmailValid(String email){
        return email.contains("@");
    }
    public boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.contains("+358");
    }
    public boolean isAdult(LocalDate dob){
        return Period.between(dob,LocalDate.now()).getYears() > 16;
    }

    public boolean isValid(Customer customer){

        return isEmailValid(customer.getEmail()) && isPhoneNumberValid(customer.getPhoneNumber())
                && isAdult(customer.getDob());

    }

}
