package engineering_concepts.dsa.SearchFunction;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Product[] products={new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Electronics"),
                new Product(103, "Keyboard", "Electronics"),
                new Product(104, "Shoes", "Fashion"),
                new Product(105, "Watch", "Accessories")};
        System.out.print("Enter Product ID to Search:");
        int id=sc.nextInt();
        System.out.println("Using Linear Search:");
        Product res1=LinearSearch.search(products,id);
        if(res1!=null)  res1.display();
        else   System.out.println("Product Not Found");
        System.out.println("Using Binary Search:");
        Product res2=BinarySearch.search(products,id);
        if (res2!=null)  res2.display();
        else   System.out.println("Product Not Found");
        sc.close();
    }
}