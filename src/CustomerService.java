import java.util.*;
public class CustomerService {
   private List<Customer> customers = new ArrayList<>();
   private int nextId = 1;

   public void addCustomer(String name, String email, String phone){
    Customer Customer = new Customer(nextId++, name, email, phone);
    customers.add(Customer);
    System.out.println("Customer successfully added.");
   }

   public List<Customer> getAllCustomers(){
      return customers;
   }

   
   public Customer findCustomerById(int id){
      for (Customer customer: customers) {
         if (customer.id() == id) {
            return customer;
         }
      }
      return null;
   }

   public void updateCustomer(int id, String name, String email, String phone){
      Customer customer = findCustomerById(id);
      if (customer != null) {
         customer.setName(name);
         customer.setEmail(email);
         customer.setPhone(phone);
         System.out.println("Customer updated sucessfully");
      }else{
         System.out.println("Customer not found");
      }
   }

   public void deleteCustomer(int id){
      Customer customer = findCustomerById(id);
      if (customer != null) {
         customer.remove(customer);
         System.out.println("Customer has been successfully deleted");
      }else{
         System.out.println("Customer not found");
      }
         
   }
}