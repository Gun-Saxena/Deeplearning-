package engineering_concepts.dsa.TaskManagementSystem;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        SinglyLinkedList m=new SinglyLinkedList();
        System.out.println("Enter Number of Tasks");
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            System.out.println("Enter Task Details");
            System.out.println("Task ID:");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.println("Task Name");
            String name=sc.nextLine();
            System.out.println("Status");
            String status=sc.nextLine();
            m.add(new Task(id,name,status));
        }
        System.out.println("Tasks");
        m.traverse();
        System.out.println("Enter Id to be searched");
        int searchId=sc.nextInt();
        m.search(searchId);
        System.out.println("Enter ID to Delete");
        int deleteId=sc.nextInt();
        m.delete(deleteId);
        System.out.println("Task After Deletion");
        m.traverse();
        sc.close();
    }
}