package engineering_concepts.dsa.LibraryManagementSystem;

public class BinarySearch{
    public static Book search(Book[] b,String t){
        int l=0;
        int h=b.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            int c=b[mid].title.compareToIgnoreCase(t);
            if (c==0){
                return b[mid];
            } 
            else if(c<0){
                l=mid+1;
            } 
            else{
                h=mid-1;
            }
        }
        return null;
    }
}
