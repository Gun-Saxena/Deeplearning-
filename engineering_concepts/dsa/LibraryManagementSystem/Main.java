package engineering_concepts.dsa.LibraryManagementSystem;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Book[] b={new Book(101,"Algorithms","Thomas Cormen"),
                new Book(102,"Clean Code","Robert Martin"),
                new Book(103,"Effective Java","Joshua Bloch"),
                new Book(104,"Java Programming","Herbert Schildt"),
                new Book(105,"Python Basics","John Doe")};
        System.out.println("Enter Title to be Searched");
        String t=sc.nextLine();
        System.out.println("Using Linear Search");
        Book res1=LinearSearch.search(b,t);
        if (res1!=null){
            res1.display();
        } 
        else{
            System.out.println("Book Not Found");
        }
        System.out.println("Using Binary Search");
        Book res2=BinarySearch.search(b,t);
        if (res2!=null){
            res2.display();
        } 
        else{
            System.out.println("Book Not Found");
        }
        sc.close();
    }
}