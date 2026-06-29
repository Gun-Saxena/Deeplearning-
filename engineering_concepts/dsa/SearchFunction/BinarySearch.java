package engineering_concepts.dsa.SearchFunction;

public class BinarySearch {
    public static Product search(Product[] products,int id){
        int l=0;
        int h=products.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(products[mid].productID==id){
                return products[mid];
            }
            else if (products[mid].productID<id) {
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return null;
    }
}
