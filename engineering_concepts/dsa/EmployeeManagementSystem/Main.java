package engineering_concepts.dsa.EmployeeManagementSystem;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Maximum Employees:");
        int s=sc.nextInt();
        EmployeeManagement m=new EmployeeManagement(s);
        System.out.println("Enter Number of Employees: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Details of Employee"+(i+1));
            System.out.println("Employee ID:");
            int id=sc.nextInt();
            System.out.println("Employee Name:");
            String nme=sc.nextLine();
            System.out.println("Position:");
            String pos=sc.nextLine();
            System.out.println("Salary:");
            double sal=sc.nextDouble();
            Employee emp=new Employee(id,nme,pos,sal);
            m.add(emp);
        }
        System.out.println("Employee Records:");
        m.traverse();
        System.out.println("Enter EmployeeId to be searched");
        int searchId=sc.nextInt();
        m.search(searchId);
        System.out.println("Enter EmployeeId to Delete");
        int deleteId=sc.nextInt();
        m.delete(deleteId);
        System.out.println("Employee Records After Deletion");
        m.traverse();
        sc.close();
    }
}