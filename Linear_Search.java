package Array;
//import java.util.*;
public class Linear_Search {
// find maximum and minimum number in the array index
    public static int Linear(int m[]){
        int min=Integer.MIN_VALUE;
        for(int i=0;i<m.length;i++){
            if(m[i]>min){
                min=m[i];
            }

        }
        return min;
    }
    public static int Min(int m[]){
        int max=Integer.MAX_VALUE;
        for(int i=0;i<m.length;i++){
            if(m[i]<max){
            max=m[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int mark[]={20,30,40,50,60};
        int a=Linear(mark);
        System.out.println("Maximum Value is ="+a);
        int b=Min(mark);
        System.out.println("Minimum Value is ="+b);
    }
    
}
