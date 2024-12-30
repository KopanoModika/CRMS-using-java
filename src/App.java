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
       "To proceed, please select an option\n");

       int option = sc.nextInt();
       sc.nextLine();

       switch (option) {
        //This case adds a new user
        case 1: {
            System.out.println("Please enter a your name:\n");
            String name = sc.nextLine();

            System.out.println("Please enter your email:\n");
            String email = sc.nextLine();

            System.out.println("Please enter your phone number:\n");
            String phone = sc.nextLine();

            customerService.addCustomer(name, email, phone);
        }
        //View all customers
        case 2:{
            System.out.println("---Customers---\n");
            for(Customer customer: customerService.getAllCustomers()){
                System.out.println(customer);
            }
        }

        //Update customers
        case 3:{
            System.out.println("Please enter customer ID:\n");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Please Enter a new name\n");
            String name = sc.nextLine();

            System.out.println("Please enter a new phone:\n");
            String phone = sc.nextLine();

            customerService.updateCustomer(id, name, name, phone);
        }

        //Delete customer
        case 4:{
            System.out.println("Please enter a customer ID to delete\n");
            int id = sc.nextInt();
            sc.nextLine();

            customerService.deleteCustomer(id);
        }

       }
    }
    
}
}