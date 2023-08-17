package Array;
// import java.util.*;

public class Search {

    public static int search(int m[],int k){
        for(int i=0;i<m.length;i++){
            if(m[i]==k){
           return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int mark[]={20,30,40,60};
        int key=40;
        int a=search(mark, key);
        if(a==-1){
         System.out.println("Index Not Number");
        }
        else{
            System.out.println("Array Index is ="+a);
        }


    }
    
}
