package Array;
import java.util.*;

public class SubArray_KadanesAlgo {

    public static void kadanes(int number[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;

        for(int i=0;i<number.length;i++){
            cs+=number[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("Maximum subarray is ="+ms);
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of Array that you want to store");
        int n=sc.nextInt();
        int number[]=new int[n];

        System.out.println("Enter the element of the Array= ");
        for(int i=0;i<n;i++){
            number[i]=sc.nextInt();
        }
        System.out.println();
        kadanes(number);
        sc.close();
    }
    
}
