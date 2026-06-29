package engineering_concepts.dsa.EmployeeManagementSystem;

public class EmployeeManagement{
    private Employee[] emp;
    private int c;
    public EmployeeManagement(int s){
        emp=new Employee[s];
        c=0;
    }
    public void add(Employee employee){
        if(c<emp.length){
            emp[c]=employee;
            c++;
            System.out.println("Employee Added");
        } 
        else{
            System.out.println("Employee Array is Full");
        }
    }
    public void search(int id){
        for(int i=0;i<c;i++){
            if(emp[i].employeeId==id){
                System.out.println("Employee Found:");
                emp[i].display();
                return;
            }
        }
        System.out.println("Employee Not Found");
    }
    public void traverse(){
        if(c==0){
            System.out.println("No Employee Records");
            return;
        }
        for(int i=0;i<c;i++){
            emp[i].display();
        }
    }
    public void delete(int id){
        int idx =-1;
        for(int i=0;i<c;i++){
            if(emp[i].employeeId==id){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            System.out.println("Employee Not Found");
            return;
        }
        for(int i=idx;i<c-1;i++){
            emp[i]=emp[i+1];
        }
        emp[c-1]=null;
        c--;
        System.out.println("Employee Deleted");
    }
}