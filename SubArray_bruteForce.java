package Array;
import java.util.*;

public class SubArray_bruteForce {
    public static void printSubarray(int n[]){
        int sum=0;
        int max=Integer.MIN_VALUE;
        int supermax=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++) {

            int start=i;

            for(int j=i;j<n.length;j++){
                int end=j;

                for(int k=start;k<=end;k++){
                    
                    System.out.print(n[k]);
                    sum+=n[k];
                }
                System.out.print(" = "+ sum);
                if(sum>max){
                    max=sum;
                }
            
                sum=0;
                System.out.println();
            }
            System.out.print("Maximum value is "+max);
            if(max>supermax){
                supermax=max;
               
            }
            
            max=Integer.MIN_VALUE;
            System.out.println();
        }
        System.out.println();
        System.out.println("Super Max is= "+supermax);
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of array that you want to store");
        int n=sc.nextInt();
        int number[]=new int[n];

        System.out.println("Enter the Element of the Array=");
        for(int i=0;i<n;i++){
            number[i]=sc.nextInt();
        }
        System.out.println();

        // Function calling
        printSubarray(number);

        sc.close();
    }
        
    
    
}
