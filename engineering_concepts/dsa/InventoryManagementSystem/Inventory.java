package engineering_concepts.dsa.InventoryManagementSystem;

import java.util.HashMap;
public class Inventory{
    private HashMap<Integer,Product>m;
    public Inventory(){
        m=new HashMap<>();
    }
    public void addProduct(Product product){
        m.put(product.getProductId(),product);
        System.out.println("Product Added");
    }
    public void updateProduct(int id,String name,int quantity,double price){
        Product product=m.get(id);
        if(product!=null){
            product.setProductName(name);
            product.setQuantity(quantity);
            product.setPrice(price);
            System.out.println("Product Updated");
        } 
        else{
            System.out.println("Product Not Found");
        }
    }
    public void deleteProduct(int id){
        if(m.remove(id)!=null){
            System.out.println("Product Deleted");
        } 
        else{
            System.out.println("Product Not Found");
        }
    }
    public void displayProducts(){
        for(Product product:m.values()){
            System.out.println(product);
        }
    }
}