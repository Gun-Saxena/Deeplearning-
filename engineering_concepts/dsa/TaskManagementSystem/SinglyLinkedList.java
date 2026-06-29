package engineering_concepts.dsa.TaskManagementSystem;

public class SinglyLinkedList{
    private Task head;
    public SinglyLinkedList(){
        head=null;
    }
    public void add(Task t){
        if (head==null){
            head=t;
            return;
        }
        Task temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=t;
    }
    public void search(int taskId){
        Task temp=head;
        while(temp!=null){
            if(temp.taskId==taskId){
                System.out.println("Task Found");
                temp.display();
                return;
            }
            temp=temp.next;
        }
        System.out.println("Task Not Found");
    }
    public void traverse(){
        if(head==null){
            System.out.println("No Tasks Available");
            return;
        }
        Task temp=head;
        while(temp!=null){
            temp.display();
            temp=temp.next;
        }
    }
    public void delete(int taskId){
        if(head==null){
            System.out.println("Task is Empty");
            return;
        }
        if(head.taskId==taskId){
            head=head.next;
            System.out.println("Task Deleted");
            return;
        }
        Task temp=head;
        while(temp.next!=null && temp.next.taskId!=taskId){
            temp=temp.next;
        }
        if(temp.next==null) {
            System.out.println("Task Not Found");
        }
        else{
            temp.next=temp.next.next;
            System.out.println("Task Deleted");
        }
    }
}