package engineering_concepts.dsa.SortingCustomerOrders;

import java.util.Scanner;

public class Main{
    public static void display(Order[] order){
        for (Order o:order){
            o.display();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of orders:");
        int n=sc.nextInt();
        sc.nextLine();
        Order[] bo=new Order[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter details of Order"+(i+1));
            System.out.println("Order ID:");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.println("Customer Name:");
            String name=sc.nextLine();
            System.out.println("Total Price:");
            double price=sc.nextDouble();
            sc.nextLine();
            bo[i]=new Order(id,name,price);
        }
        Order[] qo=bo.clone();
        BubbleSort.sort(bo);
        System.out.println("Orders after Bubble Sort:");
        display(bo);
        QuickSort.sort(qo,0,qo.length-1);
        System.out.println("Orders after Quick Sort:");
        display(qo);
        sc.close();
    }
}