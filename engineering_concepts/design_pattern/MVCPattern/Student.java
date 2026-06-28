package engineering_concepts.design_pattern.MVCPattern;

public class Student{
    private String n; 
    private int id;
    private String g; 
    public Student(String n,int id,String g){ 
        this.n=n; 
        this.id=id; 
        this.g=g; 
    } 
    public String getName(){ 
        return n; 
    } 
    public void setName(String n){ 
        this.n=n;
    }
    public int getId(){ 
        return id;
    } 
    public void setId(int id){ 
        this.id=id;
    }
    public String getGrade(){
        return g;
    } 
    public void setGrade(String g){ 
        this.g=g; 
    }
}