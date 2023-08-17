package Array;

import java.util.Scanner;

public class ArrayPair {
    public static void Pairs(int n[]){
        int tp=0;
        for (int i=0;i<n.length;i++){
            int curr=n[i];
            for(int j=i+1;j<n.length;j++){
                System.out.print("("+curr+" ,"+n[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pair="+tp);
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
        Pairs(number);

        
sc.close();
    }
}
