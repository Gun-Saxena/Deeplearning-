package engineering_concepts.design_pattern.MVCPattern;

public class StudentController{ 
    private Student s; 
    private StudentView v; 
    public StudentController(Student s,StudentView v){ 
        this.s=s; 
        this.v=v; 
    } 
    public void setStudentName(String n){ 
        s.setName(n); 
    } 
    public void setStudentId(int id){ 
        s.setId(id); 
    } 
    public void setStudentGrade(String g){ 
        s.setGrade(g); 
    } 
    public void updateView(){ 
        v.displayStudentDetails(s.getName(),s.getId(),s.getGrade()); 
    } 
}