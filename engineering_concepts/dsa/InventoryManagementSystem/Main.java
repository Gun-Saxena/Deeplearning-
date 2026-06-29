package engineering_concepts.dsa.InventoryManagementSystem;

public class Main{
    public static void main(String[] args){
        Inventory i=new Inventory();
        i.addProduct(new Product(101,"Laptop",20, 65000));
        i.addProduct(new Product(102,"Mouse",100, 500));
        i.addProduct(new Product(103,"Keyboard",50, 1200));
        System.out.println("Inventory:");
        i.displayProducts();
        i.updateProduct(102, "Wireless Mouse",80,700);
        i.deleteProduct(103);
        System.out.println("Updated Inventory:");
        i.displayProducts();
    }
}
