package function_programming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunctionalProgramming2 {
    public static void main(String[] args) {
        //normal java
        Customer zeev = new Customer("Zeev","052-404-3142");
        greetCustomer(zeev,false);
        System.out.println("===========================================");
        BiConsumer<Customer,Boolean> sayHi = (customer,showNumber) ->
                System.out.println("Hello "+customer.getCustomerName()+
                        ", thanks for registering your phone number "+
                        (showNumber?customer.getCustomerPhoneNumber():"**********"));

        sayHi.accept(zeev,false);

        Supplier<String> getSite = ()-> "www.ynet.co.il";
        System.out.println(getSite.get());

        Supplier<List<String>> getSiteHistory = ()->List.of(
                "www.ynet.co.il","www.walla.co.il","www.johnbryce.co.il"
        );
        System.out.println(getSiteHistory.get());

        List<String> myList = getSiteHistory.get();
        System.out.println(myList.get(1));
    }

    public static void greetCustomer(Customer customer,boolean showNumber){
        System.out.println("Hello "+customer.getCustomerName()+
                " thanks for registering phone number "+
                (showNumber?customer.getCustomerPhoneNumber():"**************"));
    }
}
