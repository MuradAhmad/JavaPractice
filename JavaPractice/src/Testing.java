import java.time.LocalDate;

public class Testing {

    public static void main(String [] args){

        Customer customer = new Customer(
                "murad",
                "murad@",
                "+358",
                LocalDate.of(2000,1,1)
        );



       // if Valid then we can store customer in database
        System.out.println(new CustomerValidator().isValid(customer));

    }


}
