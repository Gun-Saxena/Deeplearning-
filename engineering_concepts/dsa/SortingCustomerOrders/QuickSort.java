package engineering_concepts.dsa.SortingCustomerOrders;

public class QuickSort{
    public static void sort(Order[] order,int l,int h){
        if(l<h){
            int piv=partition(order,l,h);
            sort(order,l,piv-1);
            sort(order,piv+1,h);
        }
    }
    private static int partition(Order[] order,int l,int h){
        double piv=order[h].totalPrice;
        int i=l-1;
        for (int j=l;j<h;j++){
            if(order[j].totalPrice<piv){
                i++;
                Order temp=order[i];
                order[i]=order[j];
                order[j]=temp;
            }
        }
        Order temp=order[i+1];
        order[i+1]=order[h];
        order[h]=temp;
        return i+1;
    }
}