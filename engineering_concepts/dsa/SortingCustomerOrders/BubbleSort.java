package engineering_concepts.dsa.SortingCustomerOrders;

public class BubbleSort{
    public static void sort(Order[] order){
        int n=order.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(order[j].totalPrice>order[j+1].totalPrice){
                    Order temp=order[j];
                    order[j]=order[j+1];
                    order[j+1]=temp;
                }
            }
        }
    }
}
