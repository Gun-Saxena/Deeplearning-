package engineering_concepts.design_pattern.MVCPattern;

public class Main{ 
    public static void main(String[] args){ 
        Student s=new Student("ABC",101, "A"); 
        StudentView v=new StudentView(); 
        StudentController c=new StudentController(s,v); 
        c.updateView(); 
        c.setStudentName("XYZ"); 
        c.setStudentGrade("A+"); 
        System.out.println(); 
        c.updateView(); 
    } 
}