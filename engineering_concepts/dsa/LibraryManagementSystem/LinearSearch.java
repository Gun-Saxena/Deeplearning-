package engineering_concepts.dsa.LibraryManagementSystem;

public class LinearSearch{
    public static Book search(Book[] b,String t){
        for (Book x:b){
            if (x.title.equalsIgnoreCase(t)){
                return x;
            }
        }
        return null;
    }
}