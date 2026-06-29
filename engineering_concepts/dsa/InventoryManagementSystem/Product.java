package engineering_concepts.dsa.InventoryManagementSystem;

public class Product {
    private int productID;
    private String productName;
    private int quantity;
    private double price;
    Product(int productID,String productName,int quantity,double price){
        this.productID=productID;
        this.productName=productName;
        this.quantity=quantity;
        this.price=price;
    }
    public int getProductId(){
        return productID;
    }
    public void setProductName(String productName) {
        this.productName=productName;
    }
    public void setQuantity(int quantity) {
        this.quantity=quantity;
    }
    public void setPrice(double price) {
        this.price=price;
    }
    public String toString() {
        return "ID:"+productID+",Name:"+productName+", Quantity:"+quantity+",Price:"+price;
    }
}
