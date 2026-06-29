package engineering_concepts.dsa.SearchFunction;

public class LinearSearch {
    public static Product search(Product[] products,int id){
        for(Product p:products){
            if (p.productID==id) {
                return p;
            }
        }
        return null;
    }
}
