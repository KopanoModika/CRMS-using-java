import java.util.*;
public class App {
public static void main(String[] args) {
    CustomerService customerService = new CustomerService();
    Scanner sc = new Scanner(System.in);

    while (true) {
        System.out.println("1. Add Customer\n"+
       "2. View All Customers\n"+
       "3. Update Customer\n"+
       "4. Delete Customer\n"+
       "5. Exit\n"+
       "To proceed, please select an option");
    }
    int option = sc.nextInt();
    sc.nextLine();
}
}