package engineering_concepts.design_pattern.DepencencyInjection;

public class Main{
    public static void main(String[] args){ 
        CustomerRepository repo=new CustomerRepositoryImpl(); 
        CustomerService ser=new CustomerService(repo); 
        ser.getCustomer(101); 
    } 
}