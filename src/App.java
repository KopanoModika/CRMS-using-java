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
        break;
        //View all customers
        case 2:{
            System.out.println("---Customers---\n");
            for(Customer customer: customerService.getAllCustomers()){
                System.out.println(customer);
            }
        }
        break;

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
        break;

        //Delete customer
        case 4:{
            System.out.println("Please enter a customer ID to delete\n");
            int id = sc.nextInt();
            sc.nextLine();

            customerService.deleteCustomer(id);
        }
        break;

        //Exit application
        case 5:{
            System.out.println("thank you for using this application have a great day :)\n");
            sc.close();
            System.exit(0);
        }
       }
    }
    
}
}