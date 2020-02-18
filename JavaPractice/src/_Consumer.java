import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        //Normal Java function
        Customer murad = new Customer("Murad","123456789");
        greetCustomer(murad);

        greetCustomerV2(murad,true);

        //Consumer functional interface
        greetCustomerConsumer.accept(murad);

        greetCustomerConsumerV2.accept(murad,true);

      // greetCustomer (new Customer("Murad","123456789"));

    }

    static void greetCustomer(Customer customer){
        System.out.println("Hello!"+ customer.customerName +
                " thanks, for registering Phone Number:"+
                customer.customerPhoneNumber);
    }
    static void greetCustomerV2(Customer customer, boolean showPhoneNumber){
        System.out.println("Hello!"+ customer.customerName +
                " thanks, for registering Phone Number:"
                + (showPhoneNumber ? customer.customerPhoneNumber : "********"));
    }


    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello!"+ customer.customerName +
                    " thanks, for registering Phone Number:"
                    + (showPhoneNumber ? customer.customerPhoneNumber : "********"));

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello!"+ customer.customerName +
                    " thanks, for registering Phone Number:"
                    + customer.customerPhoneNumber);


    static class Customer{
        private final String customerName;

        private final String customerPhoneNumber;

        Customer(String name, String phone){
            this.customerName = name;
            this.customerPhoneNumber = phone;

        }


    }


}
