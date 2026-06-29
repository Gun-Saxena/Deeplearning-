package engineering_concepts.dsa.SearchFunction;

public class Product {
    int productID;
    String productName;
    String category;
    public Product(int productId,String productName,String category){
        this.productID=productId;
        this.productName=productName;
        this.category=category;
    }
    public void display(){
        System.out.println("ID:"+productID+",Name:"+productName+",Category:"+category);
    }
}
