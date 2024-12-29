public class Customer {
   private int id;
   private String Name;
   private String email;
   private String phone;

   public Customer(int id,String name, String email, String phone ){
    this.id = id;
    this.Name = name;
    this.email = email;
    this.phone = phone;

   }
   public int getId() {return id;}
   public String getName(){return Name;}
   public void setName(String name) { this.Name = name; }
   public String getEmail(){return email;}
   public void setEmail(String email) { this.email = email; }
   public String getPhone(){return phone;}
   public void setPhone(String phone) { this.phone = phone; }

   @Override
   public String toString(){
    return "ID: " + id + ", Name: " + Name + ", Email: " + email + ", Phone: " + phone;
   }
}
